package linklistcode;

public class Intersection {
    private Node head,head1;

    public Intersection() {
        this.head = null;
        this.head1=null;

    }

    public void add(int data) {                            // insert at beginning
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
    }
    public static boolean findIntersection(Node head,Node head1){
        int lenA=0;
        Node tempA=head;
        // calculating the length of node A
        while(tempA!=null){
            lenA++;
            tempA=tempA.next;

        }
        // calculating the length of node B
        int lenB=0;
        Node tempB=head;
        while(tempB!=null){
            lenB++;
            tempB=tempB.next;

        }
        //calculating difference in the length of two nodes and skip that part which is unequal
        int diff=Math.abs(lenA-lenB);
        if(lenA>lenB){
            while(diff-->0){
                tempA=tempA.next;
            }

        }else{
            while(diff-->0){
                tempB=tempB.next;
            }
        }
        //check for equality
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
            if(tempA==null || tempB==null){
                return false;
            }

        }
        if(tempA==tempB)
        System.out.print("yes");
        else
            System.out.print("no");

        return true;



    }

    public static void main(String[] args) {
        Intersection fl = new Intersection();
        fl.add(2);
        fl.add(3);
        fl.add(5);
        fl.add(9);
        fl.print();
        System.out.println();
        Intersection it = new Intersection();
        //it.add(1);

        it.add(4);
        it.add(5);
        it.add(9);


        //it.head.next=fl.head.next;
        it.print();
        // it.head1.next.next  =fl.head.next.next;
        System.out.println( findIntersection(fl.head,it.head1));




    }
}

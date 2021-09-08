package linklistcode;


public class MidOne {
    private static  Node head;
    public MidOne(){
        this.head=null;
    }
    public void add(int data) {                            // insert at beginning
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }else{
            newnode.next=head;
            head=newnode;
        }
    }






    public Node findMiddle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        System.out.println("middle element"+ slow.data);

        return head;

    }
    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;

        }
        System.out.print("null");
        System.out.println();

    }

        public static void main( String [] args){
        MidOne mo=new MidOne();
        mo.add(2);
        mo.add(4);
        mo.add(5);
        mo.add(6);
            mo.display();
        mo.findMiddle(mo.head);


    }
}

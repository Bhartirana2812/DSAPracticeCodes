package linklistcode;

public class InsertAtMid {
    private Node head;

    public InsertAtMid() {
        this.head = null;
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
    public static  void insertMid( Node head,int x){
        if (head==null){
            Node newnode= new Node(x);
            head=newnode;

        }else{
            Node newnode= new Node(x);
            Node slow=head;
            Node fast=head.next;
            while(fast!=null&& fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            newnode.next=slow.next;
            slow.next=newnode;


        }

    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        InsertAtMid pl = new InsertAtMid();
        pl.add(1);
        pl.add(2);
        pl.add(3);
        pl.add(4);
        pl.add(8);
        int x =6;
        insertMid(pl.head,x);
        pl.print();

    }
}

package linklistcode;

public class FindMiddleAndDelete {
    private Node head;
    public FindMiddleAndDelete(){
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
    public Node middleElement(Node head){
        Node fast=head;
        Node slow=head;
        Node temp=head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
             temp=slow;
            slow=slow.next;
        }

        System.out.print("middle element"+ slow.data);
        temp.next= slow.next;
        return head;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
    }

    public static void main(String [] args){
        FindMiddleAndDelete fl=new FindMiddleAndDelete();
        fl.add(2);
        fl.add(3);
        fl.add(5);
        fl.add(9);
        fl.add(10);
        fl.middleElement(fl.head);
        fl.print();

    }


}

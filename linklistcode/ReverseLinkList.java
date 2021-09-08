package linklistcode;

public class ReverseLinkList {
    private Node head;
    public ReverseLinkList(){
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
    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
    }
    public Node reverseNode(){
        Node temp=null;
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;


    }
    public static void main(String [] args){
        ReverseLinkList fl=new ReverseLinkList();
        fl.add(2);
        fl.add(3);
        fl.add(5);
        fl.add(9);
        fl.add(10);
        fl.print(fl.head);
        System.out.println("");
         Node reverse= fl.reverseNode();
        fl.print(reverse);

    }

}

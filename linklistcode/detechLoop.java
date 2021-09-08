package linklistcode;

public class detechLoop {
    private Node head;
    public detechLoop(){
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
    public static boolean Findloop(Node head){

        Node slow=head;
        Node fast=head.next;
        while(slow!=fast){
            if(fast==null || fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;


        }
        return true;


    }
    public static void main(String [] args){
        detechLoop dl=new detechLoop();
        dl.add(2);
        dl.add(4);
        dl.add(6);
        dl.add(8);
        dl.add(10);
        dl.head.next.next.next.next.next=dl.head.next;                               // creating loop 10 points to 4 in this
         boolean found=dl.Findloop(dl.head);
         if(found){
             System.out.println("Loop detected");
         }else{
             System.out.println("no loop");
         }


    }
}

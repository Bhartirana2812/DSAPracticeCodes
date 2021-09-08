package linklistcode;
import java.util.*;

public class Palindrome {
    private Node head;
     public Palindrome(){
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
    public void print(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+"-> ");
             temp=temp.next;
         }
    }
    public static boolean findpalindrome(Node head){
         Node slow=head;
         Node fast= head;
         Node prev=null;
          while(fast!=null&& fast.next!=null){
              fast=fast.next.next;
              Node temp=slow;
              slow=slow.next;
              temp.next=prev;
              prev=temp;
          }
          if(fast!=null)
              slow=slow.next;
          while(prev!=null && slow!=null){
              if(prev.data!=slow.data){
                  return false;
              }
              slow=slow.next;
              prev=prev.next;
          }
          return true; }
    public static void main(String[] args){
         Palindrome pl= new Palindrome();
         pl.add(1);
         pl.add(2);
         pl.add(3);
         pl.add(2);
         pl.add(8);
         pl.print();
        if(pl.findpalindrome(pl.head) ){
            System.out.println("palindrome");
        }else{
            System.out.println(" not palindrome");
        }

     }



}

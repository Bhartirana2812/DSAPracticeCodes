package linklistcode;

import java.util.Scanner;

public class deleteKthNodeFromLast {
    private Node head;
    public deleteKthNodeFromLast(){
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
    public Node deleteNode(int k){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        //if we have only one node in linklist ,they said to delete 1 node from end so this is the special case to handle that condition;
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;

        }
        slow.next=slow.next.next;
        return head;

    }
    public static void main(String [] args){
      deleteKthNodeFromLast fl=new deleteKthNodeFromLast();
      fl.add(2);
        fl.add(3);
        fl.add(5);
        fl.add(9);
        fl.add(10);
        fl.print();
        Scanner sc =new Scanner(System.in);
        int k=sc.nextInt();
        fl.deleteNode(k);
        fl.print();


    }

}

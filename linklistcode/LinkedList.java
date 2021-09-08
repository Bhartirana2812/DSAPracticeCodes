package linklistcode;


    class linkedlist  {

        // pahale node banalo

        static   class Node{
            int data ;
            Node next ;
            Node( int data ){
                this.data = data ;
                this.next = null ;
            }

            // function to insert new node in the list i n the begining

            Node  insertInTheBegining( Node head , int data  ) {
                Node newNode = new Node( data ) ;
                newNode.next = head ;
                head = newNode ;
                return head ;// new head with the added node in the begining
            }
        }

        public static void  main(String args[] ){

            // create  first linked list
            Node head1 = new Node(0) ;
            head1 = head1.insertInTheBegining(head1 , 10 ) ;
            head1 = head1.insertInTheBegining(head1 , 11   );
            head1 = head1.insertInTheBegining(head1 , 12 ) ;


            // create insertion
            Node  head2  = new Node( 12 ) ;
            head2.next = head1 ;
            // now second list head2 now links with one of the node of head1 list whose value is 12

            // so second list head2 's node whose value ==

            // add more node in second list head2  ;
            head2.insertInTheBegining( head2 , 55) ;
            head2.insertInTheBegining( head2 , 56 ) ;
            head2.insertInTheBegining( head2 , 57 ) ;

            // add more node in first list head1    ;
            head1 = head1.insertInTheBegining(head1 ,  12) ;
            head1 = head1.insertInTheBegining(head1 , 13 ) ;
            head1 = head1.insertInTheBegining(head1 , 14  ) ;

            // lets call function to find intersection same as which i sent from newton school link
            Node intersectioValaNode = intersection(head1 , head2 ) ;
            System.out.println(intersectioValaNode.data );


        }
        public static Node intersection(Node head1,Node head2){

            Node temp = head1 ;
            int count_head1 = 0 ;
            int count_head2 = 0 ;
            while( temp!= null ){
                temp= temp.next ;
                count_head1++ ;
            }
            temp = head2 ;
            while( temp!= null ){
                temp= temp.next ;
                count_head2++;
            }
            int diff = Math.abs( count_head1  - count_head2);

            if( count_head2 > count_head1){
                while( diff> 0 ){
                    head2 = head2.next ;
                    diff-- ;
                }
            }
            else {
                while( diff > 0 ){
                    head1 = head1.next ;
                    diff-- ;
                }
            }
            while( head1!= null ){
                if( head2== head1) return head1 ;
                head1= head1.next ;
                head2 = head2.next ;
            }
            return head2;






        }

    }


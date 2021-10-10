package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    static  int  kthLargest(int a[],int k){
        PriorityQueue<Integer> maxheap= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            maxheap.add(a[i]);
        }
        for( int i=0;i<k-1;i++){
            maxheap.poll();
        }
        return maxheap.peek();

    }




    public static void main(String args[]){
        int a[]={1,12,9,5,6,10};
        int k =4;
       System.out.print(kthLargest(a,k));

    }






}

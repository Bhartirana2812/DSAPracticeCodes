package heap;

public class MaxHeap {
    static void heapify(int a[],int n,int i){
        int largest=i;
        int left=(2*i)+1;    //left child
        int right=(2*i)+2;     //right child
        if(left<n && a[left]>a[largest])
            largest=left;

        if(right<n && a[right]>a[largest])
            largest=right;

        if(largest!=i){
            int temp=a[i];    // swap
            a[i]=a[largest];
            a[largest]=temp;
            heapify(a,n,largest);
        }




    }
    static void buildHeap(int a[],int n){
//        start heapify from non leaf node

        for(int i=(n/2)-1;i>=0;i--){
            heapify(a,n,i);
        }
    }
    static void printHeap(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String [] args){
        int a[]={4,10,3,5,1};
        int n = a.length;
        buildHeap(a,n);
        printHeap(a,n);

    }
}

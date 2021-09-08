package heap;

public class HeapifyAlgo {
    static void heapify(int a[],int n,int i){

        int largest=i;
        int l=2*i;
        int r=2*i+1;
        if(l<=n && a[l]> a[largest]){
            largest=l;
        }
        if(r<=n && a[r]> a[largest]){
            largest=r;
        }
        if(largest!=i){
            int temp=a[i];
            a[i]=a[largest];
            a[largest]=temp;

            heapify(a,n,largest);
        }
    }
    static  void buildHeap(int a[], int n){
        for(int i=(n/2)-1;i>=0;i--){
            heapify(a,n,i);
        }
    }
    static void printHeap(int a[], int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }





    public static void main(String[] args){
        int a[]={4,10,3,5,1};
        int n = a.length;
        buildHeap(a,n);
        printHeap(a,n);

    }
}

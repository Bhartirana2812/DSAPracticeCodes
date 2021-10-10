package heap;

public class MinHeap {
    static void heapify(int a[],int n,int i){

        int smallest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l< n && a[l]< a[smallest]){
            smallest=l;
        }
        if(r< n && a[r]<a[smallest]){
            smallest=r;
        }
        if(smallest!=i){
            int temp=a[i];
            a[i]=a[smallest];
            a[smallest]=temp;

            heapify(a,n,smallest);
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
//        int a[]={9,4,7,1,-2,6,5};
//        int a[]={10,5,3,4,1};
        int n = a.length;
        buildHeap(a,n);
        printHeap(a,n);

    }
}

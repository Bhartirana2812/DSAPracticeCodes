package heap;

public class DeleteElement {
     static  void heapify(int a[],int n,int i){
//         just like previous write heapify method but now for min

         int smallest =i;
         int l=(2*i)+1;
         int r=(2*i)+2;

         if(l<n && a[l]<a[smallest])
             smallest=l;

         if(r<n && a[r]<a[smallest])
             smallest=r;

         if(smallest!=i){
             int temp=a[i];
             a[i]=a[smallest];
             a[smallest]=temp;

             heapify(a,n,smallest);
         }
     }





    static int delete(int a[],int n,int i){
//        pick the last element from heap
        int last= a[n-1];
        a[i]=last;
        //reduce the size of heap then
        n=n-1;
//        for balancing call heapify        
        heapify(a,n,1) ; // 1 because starting from that index where shuffling begins

        return n;

     }

     static void printArray(int a[],int n){
         for(int i=0;i<n-1;i++){
             System.out.print(a[i]+" ");

         }
     }


    public static void main(String [] args){
        int a[]={1,4,3,5,10,6,7};
        int n=a.length;
        int i=1;
        delete(a,n,i);
        printArray(a,n);
    }
}

package heap;

public class ArrayIsMinHeap {
    static int checkarrayIsMinHeap(int a[],int n){
        int flag=0;
        for(int i=0;i<=(n/2)-1;i++){
            if(a[i]>a[2*i+1] || a[i]>a[2*i+2]) {
               return 1 ;
            }
            else if(a[i]<a[2*i+1] || a[i]<a[2*i+2]){
              return 2;
            }

        }
        return -1;


    }
    public static void main(String[] args){
        int a[]={1,4,3,5,10};
//        int a[]={10,5,3,4,1};
        int n=a.length;
      if(checkarrayIsMinHeap(a,n)==1){
          System.out.print("Max Heap");
      }
      else if(checkarrayIsMinHeap(a,n)==2){
          System.out.print("Min Heap");

      }
      else{
          System.out.print("No Heap");

      }



    }


}

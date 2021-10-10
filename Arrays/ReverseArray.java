package Arrays;

public class ReverseArray {
    public static int reverse(int a[]){
        int len = a.length-1;
        int i;
        for( i=0; i<len;i++){
            int temp= a[i];
            a[i]= a[len];
            a[len]=temp;

            len-=1;
        }
        return a[i];
    }



    public static void  main(String[] args){

        int a[]={1,3,4,5,6};
        reverse(a);
        for(int i: a)
            System.out.print(i+" ");

    }
}

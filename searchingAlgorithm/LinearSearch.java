package searchingAlgorithm;

public class LinearSearch {
    public static int findItem(int a[],int n,int x){
        for(int i=0;i<n;i++){
            if(a[i]==x){

                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[]  args){
        int a[]={1,4,5,8,9};
        int n=a.length;
        int x=5;
        int res=findItem(a,n,x);
        if(res==-1){
            System.out.print("Not found");
        }else{
            System.out.print("found");
        }


    }




}

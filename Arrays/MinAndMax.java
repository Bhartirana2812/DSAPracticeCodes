package Arrays;

public class MinAndMax {
    public static void main(String[] args){
        int a[]={1,3,5,7,8,9};
        int min= Integer.MAX_VALUE;

        int max= Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }

            if(a[i]>max){
                max= a[i];
            }
        }
        System.out.println(max+"  "+ min);
    }
}

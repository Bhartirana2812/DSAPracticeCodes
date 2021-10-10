package Arrays;

public class FindMissingNumber {
    public static void main(String [] args){
        int a[]={1,2,4,5};
        int n = 5;

        int len = a.length;
        System.out.println(len);
        int sum=0;
        int sumOfSeries= (n*(n+1))/2;
        //System.out.println(sumOfSeries);

        for(int i=0;i<len;i++)
            sum+= a[i];
        int number= sumOfSeries- sum;
        System.out.println(number);





    }

}

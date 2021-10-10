package Arrays;

public class SubArrayWithsumK {
    public static void main(String[] args){
        int a[]= {15,2,4,8,9,5,10,23};
        int sum= 23;
        int curr_sum=a[0];
        int start=0,end=1;

        while(end<=a.length){
            if(curr_sum==sum){
                System.out.println(start+" "+ (end-1));
                return;
            }

            if(curr_sum>sum&& start<end){
                curr_sum=curr_sum - a[start];
                start++;
            }
            else if(curr_sum<sum && end<a.length){
                curr_sum+= a[end];
                end++;

            }

        }
    }

}

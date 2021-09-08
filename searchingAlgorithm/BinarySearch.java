package searchingAlgorithm;

//import linklistcode.Intersection;

public class BinarySearch {
    public static void FindElement(int a[],int x){
        int low=a[0];
        int high=a.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==x){
                System.out.println("Element found at index "+mid);
                break;

            }
            if(x>a[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(low>high)
        System.out.println("elememt is not found");
    }
    public static void main(String[] args) {

        int a[]={1,2,5,7,8,9};
        int x= 8;
        FindElement(a,x);






    }

}

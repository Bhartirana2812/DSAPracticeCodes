package Arrays;
import java.util.*;


public class PairProblem {


    public static void main(String[] args) {
        int a[] = {1, 4, 5, 9, 2, 6, 8, 2};
        int sum = 4;

        Arrays.sort(a);
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            if (a[low] + a[high] == sum) {
                System.out.print(a[low] + " " + a[high]);
                return;
            }
            if (a[low] + a[high] < sum) {
                low++;
            } else {
                high--;
            }
        }

    }
}

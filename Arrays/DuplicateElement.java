package Arrays;

import java.util.HashMap;
import java.util.Set;

public class DuplicateElement {
    public static void main(String [] args) {

        int a[] = {1, 1, 2, 2, 3, 5, 7};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {

            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }


        // print all  keys

//        for(Integer e:hm.keySet())
//            System.out.print(e+" ");
//        System.out.println();


        // print all values
        for (Integer e : hm.values())
            System.out.print(e + " ");

        //print those values which are >1
        //will give duplicate element
        Set<Integer> set = hm.keySet();
        for (Integer s : set) {
            if (hm.get(s) >= 2)
                System.out.println(s + " ");
//            hm.put(a[i], 0);
        }
    }




    }


package String;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateChar {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        char [] chr= str.toCharArray();
        HashMap<Character,Integer> hm= new HashMap<>();
        for(Character ch: chr ){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);

            }
        }

        Set<Character> set= hm.keySet();
        for(Character c:set){
            if(hm.get(c)>1){
                System.out.println(c);
            }

            else if(hm.get(c)==1){
                System.out.print("First non repeating element is " + c);
                break;
            }

        }






    }
}

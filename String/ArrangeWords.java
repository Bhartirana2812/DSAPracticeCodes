package String;

import java.util.HashMap;

public class ArrangeWords {
    public static void main(String[] args){
        String str="tasty6 like2 and4 i1 its5 icecream3";
        String [] words= str.split(" ");
        int length_words= words.length;
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<length_words;i++){
            int lenword= words[i].length();
            char last_word= words[i].charAt(lenword-1);
            hm.put((int)last_word,words[i].substring(0,lenword-1));


        }

        for(int i=1+'0';i<=length_words+'0';i++){
            System.out.print(hm.get(i)+" ");
            // System.out.print(hm);

        }


    }
}

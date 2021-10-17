package String;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String [] words= str.split(" ");
        String revwords=" ";

        for(int i=0;i<words.length;i++){
            String word= words[i];
            String revword=" ";

            for(int j=word.length()-1;j>=0;j--){
                revword=revword+word.charAt(j);

            }
            revwords=revwords+revword;
        }
        System.out.print(revwords);
    }
}

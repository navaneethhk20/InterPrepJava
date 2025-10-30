package October.oct29.p4;

import java.util.Scanner;

public class l2 {
    public  static  void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String input=sc.next().toLowerCase();

        int vowel=0;
        int consonant=0;
        for(char cha: input.toCharArray()) {
            if (Character.isLetter(cha)) {
                if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        sc.close();
        System.out.println(vowel);
        System.out.println(consonant);
    }
}

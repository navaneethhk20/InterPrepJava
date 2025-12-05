package August.EX28082025.p2;

import java.util.Scanner;

public class L7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input= sc.next();
        int vowel=0;
        int consonant=0;
        for(char ch: input.toCharArray()){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            vowel++;
        }else {
            consonant++;
        }

        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}

package Year2025.Sep.Ex20250927.p3;

import java.util.Scanner;

public class L10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input= sc.nextLine().toLowerCase();

        int vowel=0;
        int consonant=0;
        for(int i=0;i<=input.length()-1;i++) {
            char ch=input.charAt(i);
            if(Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
        sc.close();


    }
}

package Year2025.Sep.Ex16092025.Ex18092025;

import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input = sc.nextLine();
        int vowel=0;
        int consonant=0;

        for (int i = 0; i <= input.length() - 1; i++) {
            char ch= Character.toLowerCase(input.charAt(i));
            if(Character.isAlphabetic(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println("vowel count is "+vowel);
        System.out.println("consonant count is "+consonant);
    }
}

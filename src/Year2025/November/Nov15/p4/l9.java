package Year2025.November.Nov15.p4;

import java.util.Scanner;

public class l9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String input=sc.nextLine().toLowerCase();

        int vowel=0;
        int consonant=0;
        for(char ch:input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
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

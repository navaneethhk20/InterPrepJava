package Year2025.January26.Jan1.p2;

import java.util.Scanner;

public class l5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input=sc.nextLine().toLowerCase();
        int vowel=0;
        int consonant=0;
        for(char ch:input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='u'){
                    vowel++;
                }else {
                    consonant++;
                }
            }

        }

        System.out.println(vowel);
        System.out.println(consonant);
    }
}

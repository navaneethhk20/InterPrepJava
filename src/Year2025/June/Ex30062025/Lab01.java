package Year2025.June.Ex30062025;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //check if char is vowel or consonant
        //count ovwels & consonant in a string
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the character");
        System.out.println("Enter the string");
       // char ch = sc.next().charAt(0);
        String name = sc.next();
        int vowel=0;
        int consonant =0;
        for(int i=0;i<name.length();i++) {
            if (name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U' || name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                //System.out.println("it is a vowel");
                vowel++;

            } else {
//            ////System.out.println("it is a consonant");
                consonant++;

            }

        }
        System.out.println(vowel);
        System.out.println(consonant);

            sc.close();


    }
}

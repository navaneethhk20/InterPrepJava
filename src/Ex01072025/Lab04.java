package Ex01072025;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        //count vowels and consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name or string to count");
        String name = sc.next();
        int vowel =0;
        int consonant = 0;
        for(int i=0;i<name.length();i++) {
            if (name.charAt(i) == 'A' || name.charAt(i) ==  'E' ||name.charAt(i) == 'I' || name.charAt(i) ==  'O' || name.charAt(i) == 'U' || name.charAt(i) ==  'a' || name.charAt(i) == 'e' || name.charAt(i) ==  'i' || name.charAt(i) == 'o' || name.charAt(i) ==  'u') {
                vowel++;
            }else {
                consonant++;
            }
        }
        System.out.println("vowel in the string is "+vowel);
        System.out.println("consonant in the string is "+consonant);
    }
}

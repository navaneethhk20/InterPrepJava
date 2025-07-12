package EX12072025;

import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        //count vowels and consonants of a string
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String name = sc.next();
        int vowel=0;
        int consonant =0;

        for (int i = 0; i <= name.length()-1; i++) {
            if (name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||name.charAt(i)=='O'||name.charAt(i)=='U'||name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                vowel++;
            }else {
                consonant++;
            }

        }
        System.out.println(name+ " consists "+vowel+" vowels and "+consonant+" consonats.");
    }
}

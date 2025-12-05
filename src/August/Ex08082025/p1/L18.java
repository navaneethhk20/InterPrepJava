package August.Ex08082025.p1;

import java.util.Scanner;

public class L18 {
    public static void main(String[] args) {
        //check if character i alphabet or not
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " it is an vowel");
            } else {
                System.out.println(ch + " is an consonant");
            }
        }
        else {
            System.out.println("enter only alphabets");
        }
    }
}

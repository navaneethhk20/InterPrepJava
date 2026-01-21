package Year2025.August.EX28082025.p2;

import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch= sc.next().charAt(0);
        if(Character.isAlphabetic(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("ovel");
            } else {
                System.out.println("consonant");
            }
        }
    }
}

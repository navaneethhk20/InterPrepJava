package Year2025.November.Nov11.p1;

import java.util.Scanner;

public class l6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character");
        char ch= sc.next().charAt(0);

        if(Character.isAlphabetic(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("vowel");
            } else {
                System.out.println("consonant");
            }
        }else {
            System.out.println("enter only Alphabets");
        }
        sc.close();

    }
}

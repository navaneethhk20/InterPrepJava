package Year2025.October.Oct01.p4;
import java.util.Scanner;
public class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        String input= sc.next().toLowerCase();
        for(char ch: input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " it is an vowel");
                } else {
                    System.out.println(ch + " it is an consonant");
                }
            }else {
                System.out.println("enter only alphabets");
            }
        }
        sc.close();
    }
}

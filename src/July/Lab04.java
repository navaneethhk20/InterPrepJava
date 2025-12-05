package July;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        //check if a character is vowel or not
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        if(ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ||ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
            System.out.println(ch+" character is vowel");
        }else {
            System.out.println(ch+ " character is consonant");
        }
        sc.close();
    }
}

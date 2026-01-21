package Year2025.July.Ex252627072025.Part3_General;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        //check a character is vowel or consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        if(ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U'|| ch=='a'||ch=='e'|| ch=='i'||ch=='o'|| ch=='u'){
            System.out.println(ch+" is a vowel");
        }else {
            System.out.println(ch+ " is a consonant");
        }
        sc.close();

    }
}

package Ex02082025.p2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        //check if character is vowel or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch= sc.next().charAt(0);

        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("vowel");
        }else {
            System.out.println("consonant");
        }
        sc.close();
    }
}

package Ex16092025.Ex18092025;

import java.util.Scanner;

public class l3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the character");
        char ch= sc.next().charAt(0);
        ch=Character.toLowerCase(ch);

        if(ch=='a' || ch =='e'||ch=='i' || ch =='o'||ch=='u'){
            System.out.println(ch+ " is a vowel.");
        }else {
            System.out.println(ch+" is a consonant.");
        }
    }
}

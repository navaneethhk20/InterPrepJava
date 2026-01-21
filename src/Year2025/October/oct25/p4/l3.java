package Year2025.October.oct25.p4;

import java.util.Scanner;
public class l3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the character");
        char ch =sc.next().charAt(0);
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
        sc.close();
    }
}

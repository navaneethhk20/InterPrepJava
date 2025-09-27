package Ex20250927.p3;

import java.util.Scanner;

public class l9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the char character");
        char ch=sc.nextLine().toLowerCase().charAt(0);


        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
            System.out.println("vowel");
        }else {
            System.out.println("consonant");
        }
        sc.close();
    }
}

package Year2025.December.Dec16.p1;

import java.util.Scanner;

public class l7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch= sc.next().toLowerCase().charAt(0);

        if(ch=='a' || ch=='e' ||ch =='i' || ch=='o' || ch=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
        sc.close();
    }
}

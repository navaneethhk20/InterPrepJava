package Year2025.January26.Jan1.p2;

import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch =sc.next().toLowerCase().charAt(0);

        if(ch=='a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("vowel");
        }else {
            System.out.println("Consonant");
        }
        sc.close();
    }
}

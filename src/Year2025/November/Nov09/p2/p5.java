package Year2025.November.Nov09.p2;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String input=sc.nextLine().toLowerCase();

        StringBuilder sb= new StringBuilder(input);
        String rev= sb.reverse().toString();
        if(input.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}

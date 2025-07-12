package EX12072025;

import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        //reverse a string using string builder and check palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String name = sc.next();
        StringBuilder sb = new StringBuilder(name);
        String rev_name = sb.reverse().toString();
        System.out.println(rev_name);
        if(name.equalsIgnoreCase(rev_name)){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}

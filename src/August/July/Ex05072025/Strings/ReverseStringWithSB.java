package August.July.Ex05072025.Strings;

import java.util.Scanner;

public class ReverseStringWithSB {
    public static void main(String [] args){
        // Write a program to reverse a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to reverse");
        String name = sc.next();
        StringBuilder sb = new StringBuilder(name);
        String rev_name = sb.reverse().toString();
        System.out.println("Reverse string is "+ rev_name);
        sc.close();
    }
}

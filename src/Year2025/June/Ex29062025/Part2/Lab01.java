package Year2025.June.Ex29062025.Part2;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //Airthmetic operations
        System.out.println("Enter the two numbers which you want to perform operation");
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("-------");
        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(n1/n2);
        System.out.println(n1%n2);
        sc.close();
    }
}

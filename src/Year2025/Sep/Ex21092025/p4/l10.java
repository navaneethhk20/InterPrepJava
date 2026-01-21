package Year2025.Sep.Ex21092025.p4;

import java.util.Scanner;

public class l10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int n1=sc.nextInt();
        int n2= sc.nextInt();
        System.out.println("enter the operation you want");
        char ch= sc.next().charAt(0);

        switch (ch){
            case  '+':
                System.out.println(n1+n2);
                break;

            case '-':
                System.out.println(n1-n2);
                break;

            case  '/':
                System.out.println(n1/n2);
                break;

            case '*':
                System.out.println(n1*n2);
                break;

            case '%':
                System.out.println(n1%n2);
                break;

            default:
                System.out.println("enter n1 as greater than n2");
        }
        sc.close();
    }
}

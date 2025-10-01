package October.Oct01.p5;

import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Enter the operation symbol you want to perform");
        char ch =sc.next().charAt(0);

        switch (ch){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '%':
                System.out.println(n1%n2);
                break;
            default:
                System.out.println("opertation is not recognized");
        }
        sc.close();
    }
}

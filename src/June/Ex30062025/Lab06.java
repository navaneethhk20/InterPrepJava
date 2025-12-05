package June.Ex30062025;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        //Airthmetic operation using switch
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 2 input ");
        int n1= scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("Enter the operation you want to perform");
        char ch =scanner.next().charAt(0);

        switch (ch){
            case '+':
                System.out.println(n1+n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            case '%':
                System.out.println(n1%n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            default:
                System.out.println("enter the falues and operator");
        }
        scanner.close();
    }
}

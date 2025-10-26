package October.oct25.p4;

import java.util.Scanner;

public class l8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("enter operation ");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
                System.out.println(num2+num1);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("operation is not clear");
        }
        sc.close();
    }
}

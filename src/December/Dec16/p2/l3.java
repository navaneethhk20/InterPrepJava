package December.Dec16.p2;

import java.util.Scanner;

public class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter the operation symbol");
        char ch= sc.next().charAt(0);

        if(ch=='+'){
            System.out.println(num1+num2);
        } else if (ch=='-') {
            System.out.println(num1-num2);
        } else if (ch=='*') {
            System.out.println(num1*num2);
        } else if (ch=='/') {
            System.out.println(num1/num2);
        }else if (ch=='%') {
            System.out.println(num1 % num2);
        }
        sc.close();
    }
}

package July;

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        //Factorial program
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++) {
             fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}

package Ex01072025;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        //Factorial of a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact =fact*i;
        }
        System.out.println(fact);
        scanner.close();
    }
}

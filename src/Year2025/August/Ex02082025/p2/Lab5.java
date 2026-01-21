package Year2025.August.Ex02082025.p2;

import java.util.Scanner;
public class Lab5 {
    public static boolean isPrime(int num){
        if(num<=1)
            return false;
        if(num==2)
            return true;
        if(num%2==0)
            return false;

        for(int i=3;i*i<=num;i=i+2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        //prime number check
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println(isPrime(number));
    }
}

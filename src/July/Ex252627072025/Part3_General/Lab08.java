package July.Ex252627072025.Part3_General;

import java.util.Scanner;

public class Lab08 {

    public static boolean isPrime(int number){
        if(number<=1)
            return false;
        if(number==2)
            return true;
        if(number%2==0)
            return false;

        for(int i=3;i*i<=number;i=i+2){
            if(number%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        //Prime number check
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println( isPrime(num));
    }
}

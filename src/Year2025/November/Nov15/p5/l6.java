package Year2025.November.Nov15.p5;

import java.util.Scanner;

public class l6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isArmStrong(num)){
            System.out.println("number is armstrong");
        }else {
            System.out.println("number is not armstrong");
        }
    }

    public static Boolean isArmStrong(int number){
        int original=number;
        double sum=0;


        int digit= String.valueOf(number).length();

        while (number>0){
            int rem=number%10;
            sum=sum+Math.pow(rem,digit);
            number=number/10;
        }
        return sum==original;
    }

}

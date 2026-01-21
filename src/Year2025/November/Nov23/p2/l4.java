package Year2025.November.Nov23.p2;

import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println(isArmstrong(num));
    }

    public static Boolean isArmstrong(int number){
        int original=number;
      double result=0;

        int digit= String.valueOf(number).length();


        while (number!=0){
            int remainder=number%10;
            result=result+Math.pow(remainder,digit);
            number=number/10;
        }
        return result==original;
    }
}

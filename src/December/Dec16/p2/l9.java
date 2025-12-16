package December.Dec16.p2;

import java.util.Scanner;

public class l9 {
    public static boolean isArmstrong(int number){
        int length=String.valueOf(number).length();
        int original=number;
         double sum=0;

        while(number!=0){
            int rem=number%10;
            sum=sum+Math.pow(rem,length);
            number=number/10;

        }
        return sum==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println(isArmstrong(num));
    }
}

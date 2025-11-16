package November.Nov16.p1;

import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not armstrong");
        }

    }
    public static Boolean isArmstrong(int number){
        int original= number;
       double sum=0;

        int digit=String.valueOf(number).length();

        while(number>0){
            int remainder= number%10;
            sum=sum+Math.pow(remainder,digit);
            number=number/10;
        }
        return sum==original;
    }
}

package Year2025.December.Dec21.p4;

import java.util.Scanner;

public class l10 {
    public static boolean isArmStrong(int num){
        int original =num;
        int sum=0;


        int length= String.valueOf(num).length();

        while(num!=0){
            int rem=num%10;
            sum=sum+(int)Math.pow(rem,length);
            num=num/10;

        }
        return original==sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println(isArmStrong(num));
    }
}

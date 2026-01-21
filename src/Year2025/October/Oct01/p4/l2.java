package Year2025.October.Oct01.p4;

import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int rev=0;
        while(num!=0){
            int reminder= num%10;
            rev=rev*10+reminder;
            num=num/10;
        }
        System.out.println(rev);
    }
}

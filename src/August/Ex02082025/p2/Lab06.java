package August.Ex02082025.p2;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        //reverse a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long number = sc.nextLong();
       long rev=0;
        while(number!=0){
          long rem = number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println(rev);
    }
}

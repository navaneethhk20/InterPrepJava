package October.oct29.p4;

import java.util.Scanner;

public class l7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("leap");
        }else {
            System.out.println("not a leap year");
        }
        sc.close();
    }
}

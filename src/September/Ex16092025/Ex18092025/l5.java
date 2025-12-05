package September.Ex16092025.Ex18092025;

import java.util.Scanner;

public class l5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year= sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+" is a leap year.");

        }else {
            System.out.println(year+" is not a leap year.");
        }
    }
}

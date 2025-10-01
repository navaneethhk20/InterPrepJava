package October.Oct01.p4;

import java.util.Scanner;

public class l5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int year =sc.nextInt();

        if(year%4==0 && year%100!=0 ||year%400==0){
            System.out.println(year+" is an leap year");
        }else {
            System.out.println(year+" is not a leap year");
        }
        sc.close();
    }
}

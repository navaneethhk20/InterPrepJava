package Ex20250927.p4;

import java.util.Scanner;

public class l3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+" is  leap year");
        }else {
            System.out.println(year+" is not a leap year");
        }
        sc.close();
    }
}

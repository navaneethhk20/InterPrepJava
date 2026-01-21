package Year2025.August.July.Ex19072025And20072025.General;

import java.util.Scanner;
public class Lab05 {
    public static void main(String[] args) {
        //Leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+" is a leap year");
        }else {
            System.out.println(year+" is not leap");
        }
        sc.close();
    }
}

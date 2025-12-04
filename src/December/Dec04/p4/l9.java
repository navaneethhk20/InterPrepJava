package December.Dec04.p4;

import java.util.Scanner;

public class l9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the tear");
        int year =sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+"  leap year");
        }else {
            System.out.println(year+" not leap year");
        }
        sc.close();
    }
}

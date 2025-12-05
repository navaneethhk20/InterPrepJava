package September.Ex21092025.p4;

import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

            if(num<0){
                System.out.println(num+" is negative.");
            }else if(num==0){
                System.out.println(num+" is zero.");
            } else {
                System.out.println(num+" is positive");
        }
        sc.close();
    }
}

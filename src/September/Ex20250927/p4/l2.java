package September.Ex20250927.p4;

import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();

        if(num==0){
            System.out.println(num+" is zero");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else {
            System.out.println(num+" is positive.");
        }
        sc.close();
    }
}

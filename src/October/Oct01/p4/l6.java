package October.Oct01.p4;

import java.util.Scanner;

public class l6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println(num1+" is largest");
        }else {
            System.out.println(num2+" is the largest");
        }
        sc.close();
    }
}

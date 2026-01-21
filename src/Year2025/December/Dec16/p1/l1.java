package Year2025.December.Dec16.p1;

import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3=sc.nextInt();

        int result= (num1>num2)?(num1>num3)?num1:num3:(num2>num3)?num2:num3;

        System.out.println(result);
    }
}

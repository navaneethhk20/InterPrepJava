package Year2025.November.Nov23.p1;

import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int max= num1>num2?num1:num2;
        System.out.println(max);
    }
}

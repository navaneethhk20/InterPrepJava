package EX12072025;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        //Maximum of 3 numbers using ternary operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int n3 =sc.nextInt();

        int result = (n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3;
        System.out.println("max is "+result);
    }
}

package Year2025.Sep.Ex16092025.Ex18092025;

import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 numbers");
        int n1=sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();

        int max= (n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3;
        System.out.println(max);
    }
}

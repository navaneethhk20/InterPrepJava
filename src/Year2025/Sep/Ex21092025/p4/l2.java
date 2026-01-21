package Year2025.Sep.Ex21092025.p4;

import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int n1=sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int max= (n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3;
        System.out.println(max);
    }
}

package June.Ex29062025.Part2;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        //Largest of 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers you want to check");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3 =sc.nextInt();
        int largest = (n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3;
        System.out.println(largest);
    }
}

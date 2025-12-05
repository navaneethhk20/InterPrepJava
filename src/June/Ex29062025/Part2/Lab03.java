package June.Ex29062025.Part2;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args){
        //To find largest of 2 numbers using ternary operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int num1 = sc.nextInt();
        int num2=sc.nextInt();
        int largest = (num1>num2)?num1:num2;
        System.out.println("largest is  "+largest);
    }
}

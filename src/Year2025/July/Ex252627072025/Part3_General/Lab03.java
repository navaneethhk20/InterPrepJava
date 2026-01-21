package Year2025.July.Ex252627072025.Part3_General;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args){
        //Even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num+" is a even number");
        }else {
            System.out.println(num+" is a odd number");
        }
        sc.close();
    }
}

package Year2025.June.Ex29062025.Part3;

import java.util.Scanner;

public class Lab02 {
    //even or odd
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num =scanner.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
        scanner.close();
    }
}

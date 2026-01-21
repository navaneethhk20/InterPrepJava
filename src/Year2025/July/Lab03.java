package Year2025.July;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        //to find even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println(number+" is a even number");
        }else {
            System.out.println(number+ " is a odd number");
        }
        sc.close();
    }
}

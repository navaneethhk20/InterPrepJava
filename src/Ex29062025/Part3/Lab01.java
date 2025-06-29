package Ex29062025.Part3;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //allowed to vote or not
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Allowed to vote");
        }else {
            System.out.println("not allowed");
        }
        sc.close();
    }
}

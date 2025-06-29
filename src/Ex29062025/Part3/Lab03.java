package Ex29062025.Part3;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("enter the age");
        byte age = sc.nextByte();
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
        System.out.println("-------");
        System.out.println("User name is "+name+", he is "+age+", and he earns "+salary+"$ per year");
    }
}

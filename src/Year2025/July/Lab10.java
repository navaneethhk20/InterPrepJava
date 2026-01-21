package Year2025.July;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        //without String builder, reverse a string

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.next();
        String rev ="";

        for(int i= name.length()-1;i >=0 ;i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}

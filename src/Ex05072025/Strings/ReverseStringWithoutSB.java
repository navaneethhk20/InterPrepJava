package Ex05072025.Strings;

import java.util.Scanner;


public class ReverseStringWithoutSB {
    public static void main(String[] args) {
        //Reverse a string without String builder
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        String rev ="";


        for (int i=name.length()-1;i>=0;i--){
            rev = rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}

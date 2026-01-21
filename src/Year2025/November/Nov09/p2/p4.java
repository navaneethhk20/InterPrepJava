package Year2025.November.Nov09.p2;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        String input="This Is Gill";
        input=input.toLowerCase();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the character to replace");
        char ch=sc.next().charAt(0);
        System.out.println("enter the character to be replaced with");
        char cha=sc.next().charAt(0);

        String result= input.replace(ch,cha);
        System.out.println(result);
    }
}

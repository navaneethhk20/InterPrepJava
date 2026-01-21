package Year2025.November.Nov09.p1;

import java.util.Scanner;
public class l1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String input=sc.nextLine();
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}

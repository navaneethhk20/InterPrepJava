package October.oct29.p4;

import java.util.Scanner;

public class l5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("number is 0");
        }else if(num%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
        sc.close();
    }
}

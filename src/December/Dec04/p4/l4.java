package December.Dec04.p4;

import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num==0){
            System.out.println("number is 0");
        } else if (num<0) {
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is positive");
        }
        sc.close();
    }
}

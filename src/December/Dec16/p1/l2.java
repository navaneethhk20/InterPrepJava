package December.Dec16.p1;

import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1= sc.nextInt();
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println("max is "+num1);
        }else{
            System.out.println("max is "+num2);
        }
        sc.close();
    }
}

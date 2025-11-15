package November.Nov15.p4;

import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num1=sc.nextInt();

        if(num1%2==0){
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
        sc.close();
    }
}

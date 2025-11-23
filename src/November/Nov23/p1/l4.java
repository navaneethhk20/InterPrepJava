package November.Nov23.p1;

import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        sc.close();
    }
}

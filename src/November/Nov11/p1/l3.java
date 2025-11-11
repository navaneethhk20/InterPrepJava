package November.Nov11.p1;

import java.util.Scanner;

public class l3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
        sc.close();
    }
}

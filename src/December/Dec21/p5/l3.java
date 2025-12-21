package December.Dec21.p5;

import java.util.Scanner;

public class l3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num==0){
            System.out.println("Zero");
        }else if(num<0){
            System.out.println("Negative");
        }else if(num>1){
            System.out.println("Positive");
        }
        sc.close();
    }
}

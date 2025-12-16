package December.Dec16.p1;

import java.util.Scanner;

public class l10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Fizz Buzz"+" ");
            } else if (i%3==0) {
                System.out.println("Fizz"+" ");
            }else if(i%5==0){
                System.out.println("Buzz"+" ");
            }else {
                System.out.println(i+" ");
            }
        }
    }
}

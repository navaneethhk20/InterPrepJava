package Year2025.January26.Jan1.p1;

import java.util.Scanner;

public class l8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();

        if(num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
        sc.close();
    }
}

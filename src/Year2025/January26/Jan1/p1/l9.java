package Year2025.January26.Jan1.p1;

import java.util.Scanner;

public class l9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num==0){
            System.out.println("Number is Zero");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Positive");
        }
        sc.close();
    }
}

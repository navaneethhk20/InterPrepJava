package Year2025.October.Oct01.p4;

import java.util.Scanner;

public class l10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num==0){
            System.out.println("zero");
        } else if (num<0) {
            System.out.println("negative");
        }else {
            System.out.println("positive");
        }
        sc.close();
    }
}

package Year2025.October.Oct01.p4;

import java.util.Scanner;

public class l8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks=sc.nextInt();

        if(marks>100 || marks<=0){
            System.out.println("Enter marks between 0 and 100");
        }
        else if(marks>=90 && marks<=100){
            System.out.println("A++");
        } else if (marks>=80 && marks<90) {
            System.out.println("A");
        } else if (marks>=70 && marks<80) {
            System.out.println("B");
        } else if (marks>=60 && marks<70) {
            System.out.println("C");
        } else if (marks>=50 && marks<60) {
            System.out.println("D");
        } else if (marks>=40 && marks<50) {
            System.out.println("E");
        }else {
            System.out.println("Fail");
        }
        sc.close();
    }
}

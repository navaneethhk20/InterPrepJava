package Ex29062025.Part3;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        //grade calculator using if else
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("please enter the score between 0 and 100");
        } else if (score > 90 && score <= 100) {
            System.out.println("A+");
        } else if (score > 80 && score <= 90) {
            System.out.println("A");
        } else if (score > 70 && score <= 80) {
            System.out.println("B");
        } else if (score > 60 && score <= 70) {
            System.out.println("C");
        } else if (score > 50 && score <= 60) {
            System.out.println("D");
        } else if (score > 40 && score <= 50) {
            System.out.println("E");
        } else if (score > 35 && score <= 40) {
            System.out.println("E+");
        } else {
            System.out.println("F");
        }sc.close();

    }

    }

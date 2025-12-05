package August.July.Ex19072025And20072025.General;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        //Grade calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();

        if (score > 90 && score <= 100) {
            System.out.println("A+");
        } else if (score > 80 && score <= 90) {
            System.out.println("A");
        } else if (score > 70 && score <= 90) {
            System.out.println("B");
        } else if (score > 60 && score <= 90) {
            System.out.println("C");
        } else if (score > 50 && score <= 90) {
            System.out.println("D");
        } else if (score > 40 && score <= 90) {
            System.out.println("E");
        } else if (score > 0 && score <= 40) {
            System.out.println("Fail");
        }
        sc.close();
    }
}

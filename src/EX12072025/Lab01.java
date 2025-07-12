package EX12072025;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //grade calculator using nested ternary
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade");
        int score = sc.nextInt();

        char grade = (score>90 && score<=100)?'A':(score>80 && score<=90)?'B':(score>70 && score<=80)?'C':(score>60 &&score<=70)?'D':(score>50 && score<=60)?'E':'F';
        System.out.println(grade);
        sc.close();

    }
}

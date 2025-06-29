package Ex29062025.Part2;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        //Grade calculator using ternary operator/condtional operator

        System.out.println("Enter the score to check the grade");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        char grade = (score>90 && score<=100)?'A':(score>80 && score<=90)?'B':(score>70 && score<=80)?'C':(score>60 && score<=70)?'D':(score>50 && score<=60)?'E':(score>40 && score<=50)?'F':'G';
        System.out.println(grade);
    }
}

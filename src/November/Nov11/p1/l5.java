package November.Nov11.p1;

import java.util.Scanner;

public class l5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the 3 sides");
        int side1= sc.nextInt();
        int side2= sc.nextInt();
        int side3= sc.nextInt();

        if((side1==side2) && (side1==side3) && (side2==side3)){
            System.out.println("equilateral");
        }else if((side1==side2) ||(side2==side3) || (side1==side3)){
            System.out.println("Isoseculus");
        }else {
            System.out.println("scalene");
        }
        sc.close();
    }
}

package November.Nov23.p1;

import java.util.Scanner;

public class l5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 3 sides ");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();

        if((side1==side2)&&(side1==side3)&&(side2==side3)){
            System.out.println("Equilateral triangle");
        }else if((side1==side2)||(side1==side3)||(side2==side3)){
            System.out.println("Isocelus");
        }else {
            System.out.println("Scalene");
        }
        sc.close();
    }
}

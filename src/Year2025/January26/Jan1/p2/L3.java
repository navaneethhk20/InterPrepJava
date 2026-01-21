package Year2025.January26.Jan1.p2;

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();

        if((side1 == side2) && (side1==side3) && (side2==side3)){
            System.out.println("Equilaterla triangle");
        }else if((side1==side2) || (side2==side3)|| (side1==side3)){
            System.out.println("Isocelus triangle");
        }else{
            System.out.println("Scalene triangle");
        }
        sc.close();
    }
}

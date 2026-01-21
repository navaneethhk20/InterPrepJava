package Year2025.June.Ex29062025.Part3;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        //Traingle classifier
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 sides values to classify a traingle");

        int side1= scanner.nextInt();
        int side2= scanner.nextInt();
        int side3= scanner.nextInt();

        if(side1 ==side2 && side1 ==side3 && side2==side3){
            System.out.println("Equilateral");
        } else if (side1 == side2 || side1 == side3 || side2==side3) {
            System.out.println("Isocellus");
        }else {
            System.out.println("Scalene");
        }
        scanner.close();
    }
}

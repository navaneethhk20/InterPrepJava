package Ex29062025.Part3;

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        //largest of 3 numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int n1 = scanner.nextInt();
        int n2= scanner.nextInt();
        int n3= scanner.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println(n1+" is the largest");
        } else if (n2>n3) {
            System.out.println(n2+" is the largest");
        }else {
            System.out.println(n3+" is the largest");
        }
        scanner.close();
    }
}

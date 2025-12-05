package August.July.Ex19072025And20072025.General;

import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args) {
        //Even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if(number%2==0){
            System.out.println(number + " is Even number");
        }else{
            System.out.println(number+ " is Odd number.");
        }
        sc.close();
    }
}

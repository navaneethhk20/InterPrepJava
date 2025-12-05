package July.Ex252627072025.Part3_General;
import java.util.Scanner;
public class Lab04 {
    public static void main(String[] args) {
        //check a number is positive or negative or zero

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if(number ==0){
            System.out.println("number is zero (0).");
        } else if (number<0) {
            System.out.println(number+"  is a negative number");
        }else {
            System.out.println(number+" is a positive number");
        }
        sc.close();

    }
}

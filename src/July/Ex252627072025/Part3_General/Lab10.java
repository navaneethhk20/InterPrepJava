package July.Ex252627072025.Part3_General;
import java.util.Scanner;
public class Lab10 {
    public static void main(String[] args){
        //Factorial of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++) {
            fact =fact*i;
        }
        System.out.println(fact);
    }
}

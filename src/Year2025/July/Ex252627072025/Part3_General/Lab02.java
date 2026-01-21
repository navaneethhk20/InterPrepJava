package Year2025.July.Ex252627072025.Part3_General;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args){
        //maximum of 2 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int n1= sc.nextInt();
        int n2 = sc.nextInt();

        int max =n1>n2?n1:n2;
        System.out.println(max);
  }
}

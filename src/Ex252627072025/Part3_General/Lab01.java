package Ex252627072025.Part3_General;
import java.util.Scanner;
public class Lab01 {
    public static void main(String[] args){
        //Max of 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
       int max = (n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println("maximum is "+max);
    }
}

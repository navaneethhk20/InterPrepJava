package July.Ex252627072025.Part3_General;
import java.util.Scanner;
public class Lab11 {
    public static void main(String[] args){
        //Airthmatic operation
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the to numbers");
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter the operation symbol");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case'/':
                if(n1>n2) {
                    System.out.println(n1 /n2);
                }else {
                    System.out.println("1st number should be greater than second");
                }
                break;
            case '%':
                if(n1>n2) {
                    System.out.println(n1 % n2);
                }else {
                    System.out.println("1st number should be greater than second");
                }
                break;
            default:
                System.out.println("Entered symbol is not valid");
        }
        sc.close();
    }
}

package December.Dec04.p4;
import java.util.Scanner;
public class l1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("is the largest "+num1);
        }else {
            System.out.println("is the largest" +num2);
        }
        sc.close();
    }
}

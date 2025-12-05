package September.Ex10092025.p3;
import java.util.Scanner;
public class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();
        int rev=0;
        while(number!=0){
            int rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println(rev);
    }
}

package Year2025.November.Nov10.p1;
import java.util.Scanner;
public class l2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the input");
        String input=sc.nextLine().toLowerCase();

        StringBuilder sb= new StringBuilder(input);
        String rev= sb.reverse().toString();
        System.out.println(rev);
        sc.close();
    }
}

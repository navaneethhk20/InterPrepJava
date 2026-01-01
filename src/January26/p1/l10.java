package January26.p1;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class l10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println(num1+ " is the largest");
        }else {
            System.out.println(num2+" is the largest");
        }
        sc.close();
    }
}

package Year2025.July.Ex252627072025.Part3_General;
import java.util.Scanner;
public class Lab07 {
    public static void main(String[] args) {
        //Leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(year%4==0 || year%100!=0 && year%400==0){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not aleap year");
        }
        sc.close();
    }

}

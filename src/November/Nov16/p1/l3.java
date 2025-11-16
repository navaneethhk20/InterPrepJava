package November.Nov16.p1;

import java.util.Scanner;

public class l3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        int sum=0;
        while (num>0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
    }
}

package December.Dec04.p3;

import java.util.Scanner;

public class l10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int rev=0;
        while(num!=0){
           int remainder=num%10;
            rev=rev*10+remainder;
            num=num/10;
        }
        System.out.println(rev);
    }
}

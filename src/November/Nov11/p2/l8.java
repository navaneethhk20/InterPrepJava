package November.Nov11.p2;

import java.util.Scanner;

public class l8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        double result=0;

        int original,remainder=0;

        int n=String.valueOf(num).length();

        original=num;

        while (original!=0){
            remainder=original%10;
            result=result+Math.pow(remainder,n);
            original=original/10;
        }

        System.out.println(result);

        if(num==result){
            System.out.println("armstrong");
        }else {
            System.out.println("not a armstrong");
        }
    }
}

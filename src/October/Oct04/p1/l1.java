package October.Oct04.p1;

import java.util.Scanner;
public class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int sumof2= sum(num1,num2);
        int mulof2 =mul(num1,num2);
        int divof2=div(num1,num2);
        int subof2=sub(num1,num2);
        int modof2=mod(num1,num2);

        System.out.println(sumof2);
        System.out.println(subof2);
        System.out.println(modof2);
        System.out.println(divof2);
        System.out.println(mulof2);


    }
    static int sum(int num1,int num2){
        return num1+num2;
    }

    static int mul(int num1,int num2){
        return num1*num2;
    }

    static int div(int num1,int num2){
        return num1/num2;
    }

    static int sub(int num1,int num2){
        return num1-num2;
    }

    static int mod(int num1,int num2){
        return num1%num2;
    }

}

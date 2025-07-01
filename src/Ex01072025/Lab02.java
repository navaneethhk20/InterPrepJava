package Ex01072025;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        //Create a function of airthmatic operation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int n2 = sc.nextInt();


        int res_sub = sub(n1,n2);
        int res_mul = mul(n1,n2);
        int res_div = div(n1,n2);
        int res_mod = mod(n1,n2);

        System.out.println(sum(n1,n2));
        System.out.println(res_sub);
        System.out.println(res_mul);
        System.out.println(res_div);
        System.out.println(res_mod);



    }
    static int sum(int n1, int n2){
        return n1+n2;
    }
    static int sub(int n1, int n2){
        return n1-n2;
    }
    static int mul(int n1, int n2){
        return n1*n2;
    }
    static int div(int n1, int n2){
        return n1/n2;
    }
    static int mod(int n1, int n2){
        return n1%n2;
    }

}

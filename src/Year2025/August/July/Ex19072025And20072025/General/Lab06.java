package Year2025.August.July.Ex19072025And20072025.General;

import java.util.Scanner;

public class Lab06 {

    public static boolean primenumber(int num){
        if(num<=1)
            return false;

        if(num==2)
            return true;
        if(num%2==0)
            return false;

        for(int i=3;i*i<=num;i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        //Prime number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
       if( primenumber(number)){
           System.out.println(number+ " is a prime number");
       }else {
           System.out.println(number+ " is not a prime number");
       }
       sc.close();
    }
}

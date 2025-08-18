package Ex18082025.p3;

import java.util.Scanner;

public class l5 {

    public  static boolean isPrime(int number){
        if(number<=1)
            return false;

        if(number==2)
            return true;

        if(number%2==0)
            return false;

        for(int i=3;i*i<=number;i++){
            if(number%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("0 to 50");
        int count=0;
        for(int i=0;i<=50;i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}

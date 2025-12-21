package December.Dec21.p5;

import java.util.Scanner;

public class l5 {

    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        if(num==2){
            return true;
        }
        if(num%2==0){
            return false;
        }

        for(int i=3;i*i<=num;i=i+2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num=100;
        for(int i=1;i<=num;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}

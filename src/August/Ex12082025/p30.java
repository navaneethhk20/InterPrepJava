package August.Ex12082025;

import java.util.Scanner;

public class p30 {

    public static boolean isprime(int number){
        if(number<=1){
            return false;
        }

        if(number==2){
            return true;
        }

        if(number%2==0){
            return false;
        }
        for (int i=3;i*i<=number;i=i+2){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n1=sc.nextInt();
        System.out.println(isprime(n1));
       // for(int i=0;i<=50;i++){
//            if(isprime(i)){
//                System.out.println(i);
//            }
//        }
    }
}

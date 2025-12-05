package July;

import java.util.Scanner;

public class Lab05 {
  public static boolean isPrime(int n){
        //check for a prime number
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for (int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the number");
        int num= scanner.nextInt();
       if(isPrime(num)){
           System.out.println(num+ " is a prime");
       }else {
           System.out.println(num+ " not a prime");
       }
       scanner.close();
    }
}

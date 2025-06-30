package Ex30062025;

import java.util.Scanner;

public class Lab03 {
    //check for prime number

    public static boolean isPrime(int n) {
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
        //Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter the number");
//        int num= scanner.nextInt();
//       if(isPrime(num)){
//           System.out.println(num+ " is a prime");
//       }else {
//           System.out.println(num+ " not a prime");
//       }
//       scanner.close();
        System.out.println("print numbers from 1 to 30");
        for (int i=1;i<=30;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}

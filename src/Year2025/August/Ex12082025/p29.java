package Year2025.August.Ex12082025;

import java.util.Scanner;

public class p29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        long num= sc.nextLong();

        long rev=0;
        while(num!=0){
            long rem= num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
        sc.close();
    }
}

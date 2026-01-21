package Year2025.October.Oct10;

import java.util.Scanner;

public class l22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int first=0;int second=1;
        if(num>=1){
            System.out.print(first+" ");;
        }

        if(num>=2){
            System.out.print(second+ " ");
        }

        for(int i=3;i<=num;i++){
            int next=first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }
        sc.close();
    }
}

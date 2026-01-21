package Year2025.Sep.Ex16092025.Ex18092025;

import java.util.Scanner;

public class i9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int first=0;
        int second=1;
        if(num>=1){
            System.out.print(first+" ");
        }
        if(num>=2) {
            System.out.print(second + " ");
        }

        for(int i=3;i<=num;i++){
            int next= first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }
    }
}

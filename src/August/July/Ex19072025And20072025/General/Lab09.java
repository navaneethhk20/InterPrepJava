package August.July.Ex19072025And20072025.General;

import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        //Fibonacci series
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the terms");
        int num = sc.nextInt();

        int first =0;
        int second = 1;

        if(num>=1){
            System.out.println(first);
        }
        if(num>=2){
            System.out.println(second);
        }

        for(int i=3;i<=num;i++){
            int next = first+second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}

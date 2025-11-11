package November.Nov11.p2;

import java.util.Scanner;

public class l3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int first=1;
        int second=2;
        if(num>=1){
            System.out.print(first+" ");
        }
        if(num>=2){
            System.out.print(second+" ");
        }

        for(int i=3;i<=num;i++){
            int next=first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }
    }
}

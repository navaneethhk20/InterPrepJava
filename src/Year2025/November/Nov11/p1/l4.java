package Year2025.November.Nov11.p1;

import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        if(num==0){
            System.out.println("zero");
        }else if(num<1){
            System.out.println("negative");
        }else {
            System.out.println("positive");
        }
        sc.close();
    }
}

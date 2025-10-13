package October.Oct13.p1;

import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String input=sc.next();
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);

    }
}

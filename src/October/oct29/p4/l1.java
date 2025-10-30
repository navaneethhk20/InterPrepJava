package October.oct29.p4;

import java.util.Scanner;
public class l1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch= sc.next().toLowerCase().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
            System.out.println("it is an vowel");
        }else{
            System.out.println("it is an consonant");
        }
        sc.close();
    }
}

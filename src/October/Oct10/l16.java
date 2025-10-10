package October.Oct10;

import java.util.Scanner;

public class l16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input= sc.next().toLowerCase();
        char [] ch= input.toCharArray();
        for(int i=0;i<=ch.length-1;i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch [i]== 'i' || ch [i]== 'o' || ch[i] == 'u') {
                System.out.println(ch [i]+ " is vowel");
            } else {
                System.out.println(ch [i]+ " is consonant");
            }
        }
        sc.close();
    }
}

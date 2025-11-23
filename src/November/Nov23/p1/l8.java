package November.Nov23.p1;

import java.util.Scanner;

public class l8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String inout= sc.nextLine().toLowerCase();

        int ovel=0;
        int consoant=0;

        for(char ch:inout.toCharArray()){
            if(Character.isAlphabetic(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ovel++;
                } else {
                    consoant++;
                }
            }
        }
        System.out.println(ovel);
        System.out.println(consoant);
    }
}

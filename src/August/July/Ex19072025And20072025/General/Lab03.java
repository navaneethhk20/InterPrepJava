package August.July.Ex19072025And20072025.General;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        //Check if character is vowel or consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        if(ch == 'A' ||ch == 'E' ||ch == 'A' ||ch == 'I' ||ch == 'O' ||ch == 'U' ||ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' || ch == 'u' ){
            System.out.println("character is vowel");
        }else{
            System.out.println("consonant");
        }
        sc.close();
    }
}

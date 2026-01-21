package Year2025.December.Dec10.p4;

import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character");
//        char ch= sc.next().toLowerCase().charAt(0);
//
//        if(ch=='a' || ch== 'e' || ch== 'i' || ch=='o' ||ch=='u'){
//            System.out.println("vowel");
//        }else {
//            System.out.println("cosnoant");
//        }
//        sc.close();

        String input= sc.nextLine().toLowerCase();
        int vowel=0;
        int consonant=0;
        for(char ch:input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}

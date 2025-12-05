package August.Ex12082025;

import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.next();
        int vowel=0;
        int consonant=0;

        for(int i=0;i<=name.length()-1;i++) {
            if (name.charAt(i) == 'a' ||name.charAt(i) == 'e' ||name.charAt(i) == 'i' ||name.charAt(i) == 'o' ||name.charAt(i) == 'u'){
                vowel++;
            }else {
            consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
        sc.close();
    }
}

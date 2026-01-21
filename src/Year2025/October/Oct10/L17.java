package Year2025.October.Oct10;

import java.util.Scanner;

public class L17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input=sc.next().toLowerCase();
        char[] ch= input.toCharArray();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<=input.length()-1;i++){
            if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
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

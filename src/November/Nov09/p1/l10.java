package November.Nov09.p1;

import java.util.Scanner;

public class l10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String input= sc.nextLine().toLowerCase();
        int vowel=0;
        int consonant=0;
        for(char ch: input.toCharArray()){
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                vowel++;
            }else{
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
        int stringlength= input.length();
        System.out.println("percentage of vowel is "+(vowel*100.0)/stringlength);
        System.out.println("percentage of consonant is "+(consonant*100.0)/stringlength);
    }
}

package Year2025.December.Dec16.p1;

import java.util.Scanner;

public class l8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input= sc.nextLine().toLowerCase();

     char[] ch = input.toCharArray();

     int vowel=0;
     int consonant=0;

          for(int i=0;i<=input.length()-1;i++){
              if(Character.isAlphabetic(ch[i])){
         if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
             vowel++;
         }else {
             consonant++;
         }
     }
     }

        System.out.println(vowel);
        System.out.println(consonant);
    }
}

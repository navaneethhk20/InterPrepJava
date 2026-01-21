package Year2025.December.Dec04.p4;

import java.util.Scanner;

public class l7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().toLowerCase().charAt(0);

          if(Character.isAlphabetic(ch)) {
              if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                  System.out.println("vowel");
              } else {
                  System.out.println("Consonant");
              }
          }else {
              System.out.println("Enter alphabets only");
          }
        sc.close();
    }
}

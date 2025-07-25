package Ex252627072025.Part3_General;
import java.util.Scanner;
public class Lab06 {
    public static void main(String[] args) {
        //count the vowels and consonant in a string
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.next();

        int vowel =0;
        int consonant=0;

        for(int i=0;i<=input.length()-1;i++){
        if(input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U'||input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u') {
            vowel++;
           }else {
            consonant++;
        }
        }

        System.out.println("vowel count is "+vowel);
        System.out.println("consonant count is "+consonant);
        sc.close();
    }
}

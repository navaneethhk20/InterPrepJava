package Year2025.August.Ex02082025.p2;

public class Lab1 {
    public static void main(String[] args) {
        //count ovewls in a string
        String input ="Nithu";
        input.toLowerCase();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<=input.length()-1;i++){
        if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u') {
            vowel++;
        }else{
            consonant++;
        }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}

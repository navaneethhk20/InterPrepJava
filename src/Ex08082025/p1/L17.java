package Ex08082025.p1;

public class L17 {
    public static void main(String[] args) {
        //check if character i alphabet or not, count vowels, consonant
        String input= "nithu";
        int vowel=0;
        int consonant=0;
      //  char[] ch= input.toCharArray();
        for(int i=0;i<=input.length()-1;i++){
        if(input.charAt(i)=='a' ||input.charAt(i)=='e' ||input.charAt(i)=='i' ||input.charAt(i)=='o' ||input.charAt(i)=='u'){
        vowel++;
        }else {
            consonant++;
        }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}

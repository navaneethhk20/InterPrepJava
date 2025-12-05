package August.July.Ex19072025And20072025.General;

public class Lab04 {
    public static void main(String[] args) {
        //count the vowel and character in a string
        String input ="Nithu";
        int vowel =0;
        int consonant=0;
        for(int i =0;i<=input.length()-1;i++){
            if(input.charAt(i) == 'A'||input.charAt(i) == 'E'||input.charAt(i) == 'I'||input.charAt(i) == 'O'||input.charAt(i) == 'U'||input.charAt(i) == 'a'||input.charAt(i) == 'e'||input.charAt(i) == 'i'||input.charAt(i) == 'o'||input.charAt(i) == 'u'){
                vowel++;
            }else {
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}

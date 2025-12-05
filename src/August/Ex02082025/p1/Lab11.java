package August.Ex02082025.p1;

public class Lab11 {
    public static void main(String[] args) {
        //seperate character,alphabet,number
        String input ="abc@#$8765";
        StringBuilder alphabet = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabet.append(ch);
            } else if (Character.isDigit(ch)) {
                number.append(ch);
            }else {
                character.append(ch);
            }
        }
        System.out.println("character: "+character);
        System.out.println(character.length());
        System.out.println("alphabets: "+alphabet);
        System.out.println(alphabet.length());
        System.out.println("digit :"+number);
        System.out.println(number.length());
    }
}

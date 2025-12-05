package July.Ex252627072025.Part1_String;

public class Lab10 {
    public static void main(String[] args){
        //from input print the numbers, character, alphabets

        String input = "abc@#$1234*&^";


        StringBuilder alphabet = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder character = new StringBuilder();
        for(char ch: input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                alphabet.append(ch);
            } else if (Character.isDigit(ch)) {
                number.append(ch);
            }else{
                character.append(ch);
            }
        }

        System.out.println("characters "+character);
        System.out.println("numbers "+ number);
        System.out.println("alphabets "+alphabet);
    }
}

package Year2025.August.Ex06082025.P1;

public class Lab8 {
    public static void main(String[] args) {
        //print the character
        String input ="asdf123*&^%gbh3456@#$";
        StringBuilder alphabets =new StringBuilder();
        StringBuilder number =new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                number.append(ch);
            }else {
                character.append(ch);
            }
        }
        System.out.println(alphabets);
        System.out.println(number);
        System.out.println(character);
    }
}

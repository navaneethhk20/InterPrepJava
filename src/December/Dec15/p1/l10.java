package December.Dec15.p1;

public class l10 {
    public static void main(String[] args) {
        String input="fsadf3435re$%#@fs";

        StringBuilder alphabets = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder character= new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else{
                character.append(ch);
            }
        }
        System.out.println(alphabets);
        System.out.println(number);
        System.out.println(character);
    }
}

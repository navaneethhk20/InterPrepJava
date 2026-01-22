package Year2026.Jan.Day22;

public class l11 {
    public static void main(String[] args){
        String input="nithu44324@$REfdsvR@$wgfed43";
        StringBuilder number = new StringBuilder();
        StringBuilder character = new StringBuilder();
        StringBuilder symbol = new StringBuilder();

        for(char ch:input.toCharArray()){
            if(Character.isAlphabetic (ch)){
                character.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else {
                symbol.append(ch);
            }
        }
        System.out.println(number);
        System.out.println(character);
        System.out.println(symbol);

    }
}

package October.oct24.p1;

public class l9 {
    public static void main(String[] args) {
        String input="ger#$GER%$$%323@#fer";
        StringBuilder character = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder symbol = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isDigit(ch)){
                number.append(ch);
            }else if(Character.isAlphabetic(ch)){
                character.append(ch);
            }else{
                symbol.append(ch);
            }
        }
        System.out.println(number);
        System.out.println(character);
        System.out.println(symbol);
    }
}

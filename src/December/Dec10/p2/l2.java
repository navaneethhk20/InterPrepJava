package December.Dec10.p2;

public class l2 {
    public static void main(String[] args) {
        String input="fsd34#$Few34";

        StringBuilder character= new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder symbol = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                character.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else {
                symbol.append(ch);
            }
        }

        System.out.println(character);
        System.out.println(number);
        System.out.println(symbol);
    }
}

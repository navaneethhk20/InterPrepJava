package October.Oct09;

public class l9 {
    public static void main(String[] args) {
        String input="fsda43$#EF$#43";
        StringBuilder alphabet = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabet.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else{
                character.append(ch);
            }
        }
        System.out.println(alphabet);
        System.out.println(number);
        System.out.println(character);
    }
}

package August.Ex21082025.p1;

public class L12 {
    public static void main(String[] args) {
        String input="asd433@#$R";
        StringBuilder number = new StringBuilder();
        StringBuilder character = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                number.append(ch);
            }else {
                character.append(ch);
            }
        }
        System.out.println(number);
        System.out.println(character);
        System.out.println(alphabets);
    }
}

package Ex09092025;

public class l4 {
    public static void main(String[] args) {
        String input="fasd5324&%$";
        StringBuilder number = new StringBuilder();
        StringBuilder character =new StringBuilder();
        StringBuilder alphabets = new StringBuilder();
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

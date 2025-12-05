package August.Ex12082025;

public class P12 {
    public static void main(String[] args) {
        String input="fds543$%^&";
        StringBuilder character = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else {
                character.append(ch);
            }
        }
        System.out.println(character);
        System.out.println(number);
        System.out.println(alphabets);
    }
}

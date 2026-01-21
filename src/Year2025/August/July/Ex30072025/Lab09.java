package Year2025.August.July.Ex30072025;

public class Lab09 {
    public static void main(String[] args) {
        String input ="abc123!@!@#";

        StringBuilder alphabets = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                digit.append(ch);
            }else {
                character.append(ch);
            }
        }
        System.out.println("characters are: "+alphabets);
        System.out.println("count of character: "+alphabets.length());
        System.out.println("special character: "+character);
        System.out.println("numbers are: "+digit);
        System.out.println("count of special character: "+character.length());
        System.out.println("number of digits: "+digit.length());

    }
}

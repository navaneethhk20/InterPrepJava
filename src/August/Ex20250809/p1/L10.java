package August.Ex20250809.p1;

public class L10 {
    public static void main(String[] args) {
        String input="nithu8105(*&";
        StringBuilder character = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();

        for(char ch:input.toCharArray()){
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

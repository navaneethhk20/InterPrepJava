package Year2025.October.oct29.p2;

public class l1 {
    public static void main(String[] args) {
        String input="fdgdf%#$R@#23fd";
        StringBuilder number = new StringBuilder();
        StringBuilder character = new StringBuilder();
        StringBuilder alphabet = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabet.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else{
                character.append(ch);
            }
        }
        System.out.println(number);
        System.out.println(character);
        System.out.println(alphabet);
    }
}

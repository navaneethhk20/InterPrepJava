package October.oct25.p1;

public class l9 {
    public static void main(String[] args) {
        String input="fds43g$%G%$GE";
        StringBuilder number = new StringBuilder();
        StringBuilder alpabets = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alpabets.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else{
                character.append(ch);
            }
        }
        System.out.println(number);
        System.out.println(character);
        System.out.println(alpabets);
    }
}

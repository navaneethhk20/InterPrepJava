package October.Oct13.p2;

public class l2 {
    public static void main(String[] args) {
        String input="fsd$#2 3fsd$ #34fsd";

        StringBuilder alphabets = new StringBuilder();
        StringBuilder number =new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(ch!=' '){
                if(Character.isAlphabetic(ch)){
                    alphabets.append(ch);
                }else if(Character.isDigit(ch)){
                    number.append(ch);
                }else {
                    character.append(ch);
                }
            }
        }
        System.out.println(alphabets);
        System.out.println(number);
        System.out.println(character);
    }
}

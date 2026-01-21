package Year2025.October.Oct01.p2;

public class l2 {
    public static void main(String[] args) {
        String input="twe%$TREGFD^%TGFgfd#$234rwe4345";
        StringBuilder number = new StringBuilder();
        StringBuilder alphabets= new StringBuilder();
        StringBuilder character = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            }else if(Character.isDigit(ch)){
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

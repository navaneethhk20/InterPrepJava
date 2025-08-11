package Ex11082025.Part1;

public class P10 {
    public static void main(String[] args) {
        String input="acd@#$@#$%65";

        StringBuilder number = new StringBuilder();
        StringBuilder alphabets= new StringBuilder();
        StringBuilder charcter = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else {
                charcter.append(ch);
            }
        }

        System.out.println(charcter);
        System.out.println(number);
        System.out.println(alphabets);

    }
}

package Year2025.Sep.Ex16092025.p2;

public class l2 {
    public static void main(String[] args) {
        String input = "nit423@#ji34#$t4kl";
        StringBuilder alphabet = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder symbol = new StringBuilder();

        for(char ch : input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabet.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else {
                symbol.append(ch);
            }
        }
        System.out.println(alphabet);
        System.out.println(number);
        System.out.println(symbol);

    }
}

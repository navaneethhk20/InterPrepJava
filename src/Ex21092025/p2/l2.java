package Ex21092025.p2;

public class l2 {
    public static void main(String[] args) {
        String input="gdfs%#GRT*657jt";
        StringBuilder alphabets= new StringBuilder();
        StringBuilder number= new StringBuilder();
        StringBuilder symbol = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else{
                symbol.append(ch);
            }
        }
        System.out.println(alphabets);
        System.out.println(number);
        System.out.println(symbol);
    }
}

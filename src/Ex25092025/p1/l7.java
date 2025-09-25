package Ex25092025.p1;

public class l7 {
    public static void main(String[] args) {
        String input="fgds$#gdsfg43g";
        StringBuilder number = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();
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
        System.out.println(number);
        System.out.println(alphabets);
        System.out.println(symbol);
    }
}

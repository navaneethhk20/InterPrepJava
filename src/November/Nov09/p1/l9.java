package November.Nov09.p1;

public class l9 {
    public static void main(String[] args) {
        String input="gsdg34234trgbfd43#$";
        StringBuilder alphabets= new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder specialcharacter = new StringBuilder();

        for(char ch:input.toCharArray()) {
            if (Character.isAlphabetic(ch)){
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                number.append(ch);
            }else {
                specialcharacter.append(ch);
            }
        }
        int lengthofstring= input.length();

        int numbersize=number.length();
        int specsize=specialcharacter.length();
       int alphasize=alphabets.length();

        System.out.println("percentage of number is " +(numbersize*100.0)/lengthofstring);
        System.out.println("percentage of special char is "+(specsize*100.0)/lengthofstring);
        System.out.println("percentage of special alphabets is "+(alphasize*100.0)/lengthofstring);
    }
}

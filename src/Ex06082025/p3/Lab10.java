package Ex06082025.p3;

public class Lab10 {
    public static void main(String[] args) {
        String input="asdf!@#$345fd%$#@876543";
        StringBuilder alphabets= new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder charcter = new StringBuilder();

        for(char ch:input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                number.append(ch);
            }else {
                charcter.append(ch);
            }
        }

        System.out.println(alphabets);
        System.out.println(number);
        System.out.println(charcter);
    }
}

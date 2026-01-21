package Year2025.August.Ex24082025.p2;

public class L2 {
    public static void main(String[] args) {
        String input="asd123#@!eqw43";
        StringBuilder alphabets = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for(char ch:input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            }else if(Character.isDigit(ch)){
                numbers.append(ch);
            }else{
                special.append(ch);
            }
        }
        System.out.println(numbers);
        System.out.println(alphabets);
        System.out.println(special);
    }
}

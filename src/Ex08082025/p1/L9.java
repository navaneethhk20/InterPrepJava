package Ex08082025.p1;

public class L9 {
    public static void main(String[] args) {
        //seperate alphabets, digits, character

        String input ="lkjhg987y6$%^lkjh&^%345";

        StringBuilder alphabes= new StringBuilder();
        StringBuilder numbers= new StringBuilder();
        StringBuilder characer = new StringBuilder();

        for(char ch: input.toCharArray()){
            if (Character.isAlphabetic(ch)) {
                alphabes.append(ch);
            }else if(Character.isDigit(ch)){
                numbers.append(ch);
            }else {
                characer.append(ch);
            }
        }

        System.out.println(alphabes);
        System.out.println(numbers);
        System.out.println(characer);
    }
}

package November.Nov22.p2;

public class l2 {
    public static void main(String[] args) {
        String input="fwefsadf#@$G323dsf";
        StringBuilder alphabets= new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char ch: input.toCharArray()){
         if(Character.isAlphabetic(ch)) {
             alphabets.append(ch);
         } else if (Character.isDigit(ch)) {
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

package Year2025.December.Dec04.p2;

public class l3 {
    public static void main(String[] args) {
        String input="hgf%^&756yth657";
        StringBuilder alphabets = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder character=new StringBuilder();
        for(char ch:input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else {
                character.append(ch);
            }
        }
        System.out.println(number);
        System.out.println(alphabets);
        System.out.println(character);
    }
}

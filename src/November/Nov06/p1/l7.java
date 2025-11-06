package November.Nov06.p1;

public class l7 {
    public static void main(String[] args) {
        String input="gwrgter^#$GERY34342ewrg54";
        StringBuilder alphabet= new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabet.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else{
                character.append(ch);
            }
        }
        System.out.println(alphabet);
        System.out.println(number);
        System.out.println(character);
    }
}

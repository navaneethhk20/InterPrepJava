package Year2025.August.EX28082025.p1;

public class L6 {
    public static void main(String[] args) {
        String input="gdf45gr#$gerw43@342ge";
        StringBuilder alphabets= new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else{
                character.append(ch);
            }
        }
        System.out.println(alphabets);
        System.out.println(number);
        System.out.println(character);
    }
}

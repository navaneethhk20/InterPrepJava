package December.Dec31.p1;

public class l3 {
    public static void main(String[] args) {
        String input="ni1u34@#$thui4#T4";
        StringBuilder alphabets= new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else {
                character.append(ch);
            }
        }
        int length= input.length();
        System.out.println(number);
        System.out.println(character);
        System.out.println(alphabets);

        System.out.println(length);
       double numberlength= number.length();

        double percentageofnumber= (numberlength/length)*100;
        double percentageofalpabets=((double) alphabets.length() /length)*100;
        double percentagecharacters=((double) character.length() /length)*100;

        System.out.println(percentageofnumber);
        System.out.println(percentagecharacters);
        System.out.println(percentageofalpabets);
    }
}

package September.Ex11092025.p2;

public class l4 {
    public static void main(String[] args) {
        String input="34grewg#@$";
        StringBuilder number = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();
        StringBuilder specialchar= new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            } else if(Character.isDigit(ch)){
                number.append(ch);
            } else {
                specialchar.append(ch);
            }
        }
        System.out.println(specialchar);
        System.out.println(number);
        System.out.println(alphabets);
    }
}

package Ex18082025.p1;

public class l11 {
    public static void main(String[] args) {
        String input="trew534$@#re53";
        StringBuilder alphabets = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder specialcharacter= new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                number.append(ch);
            }else {
                specialcharacter.append(ch);
            }
        }

        System.out.println(number);
        System.out.println(specialcharacter);
        System.out.println(alphabets);
    }
}

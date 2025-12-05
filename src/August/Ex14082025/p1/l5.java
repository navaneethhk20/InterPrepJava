package August.Ex14082025.p1;

public class l5 {
    public static void main(String[] args) {
        String input="tre432e4r33#4$";
        StringBuilder alphabets = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            }
        }
        System.out.println(alphabets);
        System.out.println(alphabets.length());
    }
}

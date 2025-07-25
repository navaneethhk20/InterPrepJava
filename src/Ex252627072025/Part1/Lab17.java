package Ex252627072025.Part1;

public class Lab17 {
    public static void main(String[] args) {
        //Change the character cases each other
        String input ="NavaNeEtH";
        StringBuilder sb = new StringBuilder();

        for(char ch: input.toCharArray()) {
            if (Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            } else if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else {
                sb.append(ch);
            }
        }
            System.out.println(sb);

    }
}

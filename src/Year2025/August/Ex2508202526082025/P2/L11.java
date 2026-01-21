package Year2025.August.Ex2508202526082025.P2;

public class L11 {
    public static void main(String[] args) {
        String input="HexaWaRe";
        StringBuilder sb = new StringBuilder();
        for(char ch: input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}

package Year2025.October.Oct10;

public class l4 {
    public static void main(String[] args) {
        String input="HexaWare";
        StringBuilder sb = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.toString();
            }
        }
        System.out.println(sb.toString());
    }
}

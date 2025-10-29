package October.oct29.p3;

public class l6 {
    public static void main(String[] args) {
            String input="HexaWare";

            StringBuilder sb = new StringBuilder();

            for(char ch: input.toCharArray()){
                if(Character.isUpperCase(ch)){
                    sb.append(Character.toLowerCase(ch));
                }else if(Character.isLowerCase(ch)){
                    sb.append(Character.toUpperCase(ch));
                }else {
                    sb.append(sb.toString());
                }
            }
        System.out.println(sb.toString());
    }
}

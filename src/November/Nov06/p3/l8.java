package November.Nov06.p3;

public class l8 {
    public static void main(String[] args) {
        String input="HexAWare";
        StringBuilder sb= new StringBuilder();
        for(char ch: input.toCharArray()){
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}

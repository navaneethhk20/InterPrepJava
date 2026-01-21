package Year2025.Sep.Ex21092025.p3;

public class l4 {
    public static void main(String[] args) {
        String input="NithU";
        StringBuilder sb = new StringBuilder();
        for(char ch:input.toCharArray()){
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}

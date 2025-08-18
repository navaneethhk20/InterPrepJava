package Ex18082025.p3;

public class l2 {
    public static void main(String[] args) {
        String input="nItHu";
        StringBuilder sb = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else if(Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb.toString());
    }
}

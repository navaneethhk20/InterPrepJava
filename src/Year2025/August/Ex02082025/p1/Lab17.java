package Year2025.August.Ex02082025.p1;

public class Lab17 {
    public static void main(String[] args) {
        //lower to upper and vive-versa
        String input ="NaVanEEtH";
        StringBuilder sb= new StringBuilder();
        for(char ch: input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            }else if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}

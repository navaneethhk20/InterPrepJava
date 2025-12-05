package August.Ex06082025.P1;

public class Lab9 {
    public static void main(String[] args) {
        //convert the character
        String input ="NaVaNeeTh";
        StringBuilder sb = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(Character.isLowerCase(ch)){
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

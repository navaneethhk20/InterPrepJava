package Ex06082025.p3;

public class Lab15 {
    public static void main(String[] args) {
        String input ="Navaneeth";
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

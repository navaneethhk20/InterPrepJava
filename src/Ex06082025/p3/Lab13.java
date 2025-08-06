package Ex06082025.p3;
import java.util.HashMap;
public class Lab13 {
    public static void main(String[] args){
        String input ="tomorrow";
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            hashmap.put(ch, hashmap.getOrDefault(ch, 0) +1);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=input.length()-1;i++){
            char currentchar =input.charAt(i);
            int frenquency= hashmap.get(currentchar);
            if(frenquency==1|| frenquency==2){
                sb.append(currentchar);
            }else {
                sb.append("$");
            }
        }
        System.out.println(sb.toString());
    }
}

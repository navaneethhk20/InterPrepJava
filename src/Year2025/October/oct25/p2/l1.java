package Year2025.October.oct25.p2;
import java.util.HashMap;
public class l1 {
    public static void main(String[] args) {
        String input="tomorrow";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<=input.length()-1;i++){
            char currentchar= input.charAt(i);
            int frequncy= hashmap.get(currentchar);
            if(frequncy==1 || frequncy==2){
                sb.append(currentchar);
            }else{
                sb.append("$");
            }
        }
        System.out.println(sb.toString());
    }
}

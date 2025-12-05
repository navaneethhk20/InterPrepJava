package August.EX28082025.p1;
import java.util.HashMap;
import java.util.Map;
public class L5 {
    public static void main(String[] args) {
        String input="navaneeth kumar hosuru";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        for(Map.Entry<Character,Integer> entry: hashmap.entrySet()){
         System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times.");
        }
    }
}

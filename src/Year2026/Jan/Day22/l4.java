package Year2026.Jan.Day22;

import java.util.HashMap;
import java.util.Map;

public class l4 {
    public static void main(String[] args) {
        String input="automation";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: hashmap.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue());
        }
    }
}

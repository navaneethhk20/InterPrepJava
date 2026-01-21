package Year2025.October.oct29.p1;

import java.util.HashMap;
import java.util.Map;

public class l5 {
    public static void main(String[] args) {
        String input="Gdfgregfdsf";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: hashmap.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times.");
        }
    }
}

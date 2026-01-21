package Year2025.Sep.Ex16092025.p1;

import java.util.HashMap;
import  java.util.Map;

public class l4 {
    public static void main(String[] args) {
        String input="Whitefield";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character, Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times.");
        }
    }
}

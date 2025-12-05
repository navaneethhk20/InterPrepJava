package August.Ex24082025.p1;

import java.util.HashMap;
import java.util.Map;

public class L6 {
    public static void main(String[] args) {
        String input="navaneeth hosuru kumar";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }

        for(Map.Entry<Character,Integer>entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times.");
        }
    }
}

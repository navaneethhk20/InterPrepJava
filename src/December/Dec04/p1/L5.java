package December.Dec04.p1;

import java.util.HashMap;
import java.util.Map;

public class L5 {
    public static void main(String[] args) {
        String input="navaneeth hosuru koppalu";
        HashMap<Character,Integer> hashMap =new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }
        for(Map.Entry<Character,Integer> enrtry: hashMap.entrySet()){
            System.out.println(enrtry.getKey()+" occurs "+enrtry.getValue());
        }
    }
}

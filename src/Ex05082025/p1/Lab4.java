package Ex05082025.p1;

import java.util.HashMap;
import java.util.Map;

public class Lab4 {
    public static void main(String[] args) {
        //occurence of each character
        String input="Nithu";
        HashMap<Character, Integer>hashMap = new HashMap<>();
        for(char ch:input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue());
        }
    }
}

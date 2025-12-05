package August.July.Ex30072025;

import java.util.HashMap;
import java.util.Map;

public class Lab05 {
    public static void main(String[] args){
        String input = "poioiplo";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character, Integer>entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+"occurrs "+entry.getValue()+"times");
        }


    }
}

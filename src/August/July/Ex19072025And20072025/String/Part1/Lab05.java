package August.July.Ex19072025And20072025.String.Part1;

import java.util.HashMap;
import java.util.Map;

public class Lab05 {
    public static void main(String[] args){
        //count the occurence
        String input= "Navaneeth";
        input= input.toLowerCase();

        HashMap <Character, Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character, Integer>entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" occurs "+ entry.getValue()+" times.");
        }

    }
}

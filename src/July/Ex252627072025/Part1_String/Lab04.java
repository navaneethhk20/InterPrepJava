package July.Ex252627072025.Part1_String;

import java.util.HashMap;
import java.util.HashSet;

public class Lab04 {
    //print non unique characters in a string
    public static void main(String[] args){
        String input = "Navaneeth";
        input  = input.toLowerCase();

        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch, 0)+1);
        }

        HashSet<Character> hashset = new HashSet<>();
        for(char ch: input.toCharArray()){
            if (hashmap.get(ch) > 1 && !hashset.contains(ch)){
                System.out.println(ch);
                hashset.add(ch);
            }
        }
    }
}

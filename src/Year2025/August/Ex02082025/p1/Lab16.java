package Year2025.August.Ex02082025.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class Lab16 {
    public static void main(String[] args) {
        //first repeated & non repeated character in a string
        String input ="Swissrmissesme";
        input =input.toLowerCase();

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashmap.get(ch)==1&&!list.contains(ch)){
                list.add(ch);
            }
        }
        System.out.println(list);
        System.out.println(list.get(0));
    }
}

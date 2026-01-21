package Year2025.July.Ex252627072025.Part1_String;

import java.util.ArrayList;
import java.util.HashMap;

public class Lab015 {
    public static void main(String[] args) {
        //print first non repeated & repeated character in s string
        String input = "Swissik";
        input = input.toLowerCase();

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashmap.get(ch)==1 &&!list.contains(ch)){
                System.out.println(ch);
             list.add(ch);
            }
        };

        System.out.println(list.get(0));

    }
}

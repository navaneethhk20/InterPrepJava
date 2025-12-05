package August.July.Ex05072025.Strings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachCharacter {
    public static void main(String[] args) {
        //Occurence Of Each Character
        String str = "navaneeth";

        HashMap<Character, Integer> charCount = new HashMap<>();


        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }


        System.out.println("Character frequencies:");

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}

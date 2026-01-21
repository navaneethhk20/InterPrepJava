package Year2025.August.July.Ex13072025.String.Part1;

import java.util.HashMap;
import java.util.Map;

public class Lab07 {
    public static void main(String[] args) {
        String input ="Whitefield kadu kodi";
        input = input.toLowerCase();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" occurs " +entry.getValue()+" times ");
        }
    }
}

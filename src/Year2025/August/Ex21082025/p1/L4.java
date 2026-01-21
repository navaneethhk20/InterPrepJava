package Year2025.August.Ex21082025.p1;

import java.util.HashMap;

public class L4 {
    public static void main(String[] args) {
        String input="ramesh sachin tendulkar";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        int repeating=0;
        for(int frequency: hashmap.values()) {
                if (frequency > 1) {
                    repeating++;
                }
        }
        System.out.println(repeating);
    }
}

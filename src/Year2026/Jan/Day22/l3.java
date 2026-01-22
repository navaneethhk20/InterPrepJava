package Year2026.Jan.Day22;

import java.util.HashMap;

public class l3 {
    public static void main(String[] args) {
        String input="Ramesh Sachin Tendulkar";
        input= input.toLowerCase();
        int repeatingcount=0;

        HashMap<Character,Integer> hashmap  = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        for(int count: hashmap.values()) {
                if (count > 1) {
                    repeatingcount++;
            }
        }
        System.out.println(repeatingcount);
    }
}

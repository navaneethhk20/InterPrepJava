package Ex14082025.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class i23 {
    public static void main(String[] args) {
        String input="Ramesh sachin tendulkar";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch : input.toCharArray()) {
            if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }
        int repeatingcount=0;

        for(char ch: input.toCharArray()){
            if(ch!=' ') {
                if (hashMap.get(ch) > 1) {
                    repeatingcount++;
                }
            }

        }
        System.out.println(repeatingcount);
    }
}

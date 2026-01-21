package Year2025.November.Nov22.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class l3 {
    public static void main(String[] args) {
        String input="gertre wfds sfwe";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch:input.toCharArray()){
            if(ch!=' ') {
                if (hashmap.get(ch) == 1 && !list.contains(ch)) {
                    list.add(ch);
                }
            }
        }
        System.out.println(list);
    }
}

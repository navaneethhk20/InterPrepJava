package Year2025.November.Nov15.p3;

import java.util.ArrayList;
import java.util.HashMap;

public class l7 {
    public static void main(String[] args) {
        String input="swisff";

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (char ch: input.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> List = new ArrayList<>();
        for(char ch:input.toCharArray()) {
            if (hashMap.get(ch) == 1 && !List.contains(ch)) {
                List.add(ch);
            }
        }
        System.out.println(List);
        System.out.println(List.get(0));
    }
}

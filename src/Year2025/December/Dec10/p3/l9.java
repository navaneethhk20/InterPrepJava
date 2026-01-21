package Year2025.December.Dec10.p3;

import java.util.ArrayList;
import java.util.HashMap;

public class l9 {
    public static void main(String[] args) {
        String inout="swiss";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: inout.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: inout.toCharArray()) {
            if (hashMap.get(ch) == 1 && !list.contains(ch)) {
                list.add(ch);
            }
        }
        System.out.println(list);
    }
}

package Year2025.October.oct29.p3;

import java.util.ArrayList;
import java.util.HashMap;

public class l5 {
    public static void main(String[] args) {
        String input="swiss";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> lsit = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashMap.get(ch)== 1 && !lsit.contains(ch)) {
                lsit.add(ch);
            }
        }
        System.out.println(lsit);
        System.out.println(lsit.get(0));
     }
}

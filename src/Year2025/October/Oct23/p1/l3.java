package Year2025.October.Oct23.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class l3 {
    public static void main(String[] args) {
        String input="rtrrtwe";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch : input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }
        ArrayList<Character>list= new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashmap.get(ch)==1 && !list.contains(ch)){
                list.add(ch);
            }
        }
        System.out.println(list);
    }
}

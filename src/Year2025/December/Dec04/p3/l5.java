package Year2025.December.Dec04.p3;

import java.util.ArrayList;
import java.util.HashMap;

public class l5 {
    public static void main(String[] args) {
        String input = "Swiss";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character>list = new ArrayList<>();
        for(char ch:input.toCharArray()){
            if(hashMap.get(ch)==1 && !list.contains(ch)){
                list.add(ch);
            }
        }
        int lastelement= list.size();
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(lastelement-1));
    }
}

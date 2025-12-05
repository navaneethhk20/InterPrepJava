package September.Ex21092025.p1;

import java.util.HashMap;
import java.util.HashSet;
public class l3 {
    public static void main(String[] args) {
        String input="Framework";
        HashMap<Character,Integer> hashmap= new HashMap<>();
        for(char ch: input.toCharArray()){
          hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }
        HashSet<Character> set= new HashSet<>();
        for(char ch:input.toCharArray()){
            if(hashmap.get(ch)==1&&!set.contains(ch)){
                set.add(ch);
            }
        }
        System.out.println(set);
    }
}

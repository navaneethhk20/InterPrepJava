package Year2026.Jan.Day22;
import java.util.HashMap;
import java.util.HashSet;

public class l2 {
    public static void main(String[] args) {
        String input="automation";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        HashSet<Character> listelements = new HashSet<>();
        for(char ch: input.toCharArray()){
            if(hashmap.get(ch)==1 && !listelements.contains(ch)){
                listelements.add(ch);
            }
        }
        System.out.println(listelements);
    }
}

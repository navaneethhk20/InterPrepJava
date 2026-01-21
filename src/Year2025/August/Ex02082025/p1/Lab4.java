package Year2025.August.Ex02082025.p1;
import java.util.HashMap;
import java.util.HashSet;
public class Lab4 {
    public static void main(String[] args) {
        ////print non -unique character
        String input ="navaneeth";
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
           hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        HashSet<Character> set = new HashSet<>();
        for(char ch: input.toCharArray()){
            if(hashmap.get(ch)>1 &&!set.contains(ch)){
                System.out.print(ch+" ");
                set.add(ch);
            }
        }

    }
}

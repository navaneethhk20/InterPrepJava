package Ex252627072025.Part1_String;
import java.util.HashMap;
import java.util.Map;

public class Lab06 {
    //occurence of each character
    public static void main(String[] args) {
        String input = "Navaneeth";
        input = input.toLowerCase();

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer>entry: hashmap.entrySet()){
            System.out.println(entry.getKey()+" occurs "+ entry.getValue()+" times");
        }

    }

}
package Year2025.August.Ex05082025.p1;
import java.util.HashMap;
public class Lab3 {
    public static void main(String[] args) {
        //count the no of repeating char
        String input ="Ramesh sachin tendulkar";
        input=input.toLowerCase();
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        int repeatingcount=0;
        for(int freqency:hashmap.values()) {
            if (freqency > 1) {
                repeatingcount++;
            }
        }
        System.out.println(repeatingcount);
    }
}

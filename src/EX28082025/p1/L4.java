package EX28082025.p1;
import java.util.HashMap;
public class L4 {
    public static void main(String[] args) {
        String input="Nithu Hosuru Kumar Koppalu";
        input= input.toLowerCase();
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {

                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);

        }

        int repeatingcount=0;
        for(int frequency: hashmap.values()){
            if(frequency>1){
                repeatingcount++;
            }
        }
        System.out.println(repeatingcount);
    }
}

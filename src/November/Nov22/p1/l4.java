package November.Nov22.p1;
import java.util.HashMap;
public class l4 {
    public static void main(String[] args) {
        String input="Ramesh sachin tendulkar";
        input= input.toLowerCase();
        int count=0;

        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch:input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        for(int frequency: hashmap.values()){
            if(frequency>1){
                count++;
            }
        }
        System.out.println(count);
    }
}

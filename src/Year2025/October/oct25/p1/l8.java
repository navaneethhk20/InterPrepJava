package Year2025.October.oct25.p1;
import java.util.HashMap;
public class l8 {
    public static void main(String[] args) {
        String input="gdsrgewr gert grt";
        int repeatingcount=0;
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            if(ch!=' '){
                hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
            }
        }


        for(int frequency: hashmap.values()){
            if(frequency>1){
                repeatingcount++;

            }
        }
        System.out.println(repeatingcount);
    }
}

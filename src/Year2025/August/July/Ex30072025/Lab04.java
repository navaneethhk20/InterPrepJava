package Year2025.August.July.Ex30072025;
import java.util.HashMap;

public class Lab04 {
    public static void main(String[] args){
        String input ="Whitefield kadugodi treepark";

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }
        int repeatingchar =0;
        for(int frequency: hashmap.values()){
            if(frequency>1){
                repeatingchar++;
            }

        }
        System.out.println(repeatingchar);

    }
}

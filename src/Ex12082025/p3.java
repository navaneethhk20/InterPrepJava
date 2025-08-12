package Ex12082025;

import java.util.HashMap;

public class p3 {
    public static void main(String[] args) {
        String input="whitefield kadugodi treepark";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }
        int repeatingcount =0;
        for(int frequency:hashmap.values()){
            if(frequency>1){
                repeatingcount++;
            }
        }
        System.out.println(repeatingcount);
    }
}

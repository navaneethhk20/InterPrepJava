package Ex24082025.p1;

import java.util.HashMap;

public class L5 {
    public static void main(String[] args) {
        String input="navaneeth kumar nithu";
        HashMap<Character,Integer>hashmap = new HashMap<>();
        for(char ch:input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        int repeatingcoint=0;
        for(int frequency: hashmap.values()){
            if(frequency>1){
                repeatingcoint++;
            }

        }
        System.out.println(repeatingcoint);
    }
}

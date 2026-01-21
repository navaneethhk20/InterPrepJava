package Year2025.Sep.Ex21092025.p1;

import java.util.HashMap;

public class l4 {
    public static void main(String[] args) {
        String input="Ramesh Sachin Tendulkar";
        input= input.toLowerCase();
        int repeatingcount=0;
        HashMap<Character,Integer> hashmap= new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
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

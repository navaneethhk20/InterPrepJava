package Year2025.August.Ex06082025.p3;

import java.util.HashMap;
public class Lab4 {
    public static void main(String[] args) {
        String input ="Ramesh Sachin tendulkar";
        input = input.toLowerCase();

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }

        }
        int repeatingcount=0;
        for(int frequency:hashmap.values()){
            if(frequency>1){
                repeatingcount++;
            }
        }
        System.out.println(repeatingcount);
    }
}

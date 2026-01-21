package Year2025.August.Ex08082025.p1;

import java.util.HashMap;

public class L4 {
    public static void main(String[] args){
        //count repeating charater
        String input= "Hosurukoppalu kumar Navaneeth";
        input = input.toLowerCase();
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }
        int repeatingcount=0;
        for(int freqency:hashmap.values()){
            if(freqency>1){
                repeatingcount++;
            }
        }
        System.out.println(repeatingcount);
    }
}

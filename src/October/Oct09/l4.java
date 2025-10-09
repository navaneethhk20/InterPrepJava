package October.Oct09;

import java.util.HashMap;

public class l4 {
    public static void main(String[] args) {
        String input="ramesh sachin tendulkar";
        int repeatingcount=0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }
        for(int frequency: hashMap.values()){
            if(frequency>1){
                repeatingcount++;
            }
        }
        System.out.println(repeatingcount);
    }
}

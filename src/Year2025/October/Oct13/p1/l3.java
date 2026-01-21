package Year2025.October.Oct13.p1;

import java.util.HashMap;

public class l3 {
    public static void main(String[] args) {
        String input=" Ramesh Sachin Tendulkar";
        input= input.trim().toLowerCase();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            //if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            //}
        }
        int repeatingcount=0;

        for(int frequency: hashMap.values()){
            if(frequency>1){
                repeatingcount++;
            }
        }
        System.out.println(repeatingcount);
    }
}

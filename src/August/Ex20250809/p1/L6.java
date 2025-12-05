package August.Ex20250809.p1;

import java.util.HashMap;

public class L6 {
    public static void main(String[] args) {
        String input="Ramesh Sachin tendulkar";
        int repeating = 0;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char ch:input.toCharArray()) {
            if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }
        for(int frequency: hashMap.values()){

            if(frequency>1){
                repeating++;
            }
        }
        System.out.println(repeating);
    }
}

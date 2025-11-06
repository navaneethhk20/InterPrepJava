package November.Nov06.p2;

import java.util.HashMap;

public class l2 {
    public static void main(String[] args) {
        String input="Ramesh sachin tendulkar";
        input=input.toLowerCase();

        HashMap<Character,Integer>hashMap= new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }

        int count=0;
        for(int freqency: hashMap.values()){
            if(freqency>1){
                count++;
            }
        }
        System.out.println(count);
    }
}

package November.Nov10.p1;

import java.util.HashMap;

public class l4 {
    public static void main(String[] args) {
        String input="Ramesh Sachin Tnedulkar";
        input=input.toLowerCase();

        HashMap<Character,Integer> hashMap= new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }
        int count=0;

        for(int frequency: hashMap.values()){
            if(frequency>1){
                count++;
            }
        }
        System.out.println(count);
    }
}

package September.Ex16092025.p1;

import java.util.HashMap;

public class l3 {
    public static void main(String[] args) {
        String input="Whitefield Kadugodi metro";
        input= input.toLowerCase();
        int repeatingcount=0;
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
           if(ch!=' '){
                hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
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

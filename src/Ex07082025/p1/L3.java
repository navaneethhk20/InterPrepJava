package Ex07082025.p1;

import java.util.HashMap;
import java.util.ArrayList;

public class L3 {
    public static void main(String[] args){
        String input="utyretyyutr";

        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashmap.get(ch)>1&&!list.contains(ch)){
                list.add(ch);
                System.out.print(ch+" ");
            }
        }

    }
}

package October.Oct01.p4;

import java.util.ArrayList;
import java.util.HashMap;

public class l1 {
    public static void main(String[] args) {
        String input ="Elephant";
        input= input.toLowerCase();
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashmap.get(ch)==1&& !list.contains(ch)){
                list.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: list){
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}

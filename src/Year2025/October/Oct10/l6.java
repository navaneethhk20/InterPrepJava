package Year2025.October.Oct10;

import java.util.ArrayList;
import java.util.HashMap;

public class l6 {
    public static void main(String[] args) {
        String inout="Navaneeth";
        inout=inout.toLowerCase();

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: inout.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character>list = new ArrayList<>();
        for(char ch: inout.toCharArray()){
            if(hashMap.get(ch)>1 && !list.contains(ch)){
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

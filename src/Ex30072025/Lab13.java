package Ex30072025;

import java.util.ArrayList;
import java.util.HashMap;


public class Lab13 {
    public static void main(String[] args) {
        String input="swisschees";

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> hashSet = new ArrayList<>();
        for(char ch:input.toCharArray()){
            if(hashMap.get(ch)==1&&!hashSet.contains(ch)){
                System.out.print(ch+" ");
                hashSet.add(ch);
            }
        }
        System.out.println("");

        System.out.println(hashSet.get(0));

    }
}

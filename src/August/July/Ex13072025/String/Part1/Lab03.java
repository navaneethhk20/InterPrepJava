package August.July.Ex13072025.String.Part1;

import java.util.HashMap;
import java.util.HashSet;

public class Lab03 {
    public static void main(String[] args) {
        String input ="whitefield";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }

        HashSet<Character> print = new HashSet<>();
        for(char ch : input.toCharArray()){
            if(hashMap.get(ch)==1 &&!print.contains(ch)){
                System.out.println(ch);
              print.add(ch);
            }
        }
    }
}

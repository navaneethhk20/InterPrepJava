package Year2025.August.July.Ex13072025.String.Part1;

import java.util.HashMap;
import java.util.HashSet;

public class Lab02 {
    public static void main(String[] args) {
        String input = "navaneeth";

        //to find the character and there occurence ,
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch : input.toCharArray()){
            hashMap.put(ch , hashMap.getOrDefault(ch,0)+1);
        }
// print the unique =1 and non unique >1
        HashSet<Character> printed = new HashSet<>();
        for(char ch :input.toCharArray()){
            if(hashMap.get(ch)>1&&!printed.contains(ch)){
                System.out.println(ch);
                printed.add(ch);
            }
        }
    }
}

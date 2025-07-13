package Ex13072025.String.Part1;

import java.util.HashMap;
import java.util.HashSet;

public class Lab01 {
    public static  void main(String [] args){
        //Input= "rtrrutwe", print unique and not unique character
        String input ="rtrrutwe";
        //we need to find the occurence of each character
        HashMap<Character , Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }
            HashSet<Character> printed = new HashSet<>();
            for(char ch: input.toCharArray()){
                if(hashMap.get(ch)>1&&!printed.contains(ch)){
                    System.out.println(ch);
                    printed.add(ch);
                }
            }
            HashSet<Character> unprinted = new HashSet<>();
            for(char ch: input.toCharArray()){
                if(hashMap.get(ch)== 1 && !unprinted.contains(ch)){
                    System.out.println(ch);
                    unprinted.add(ch);
                }
            }
    }
}

package Year2025.July.Ex252627072025.Part1_String;

import java.util.HashMap;
import java.util.HashSet;

public class Lab03 {
    //print unique character in a string
    public static void main(String[] args){
        String input ="Navaneeth";
        input = input.toLowerCase();

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        HashSet<Character> hashSet = new HashSet<>();
        for(char ch: input.toCharArray()){
            if(hashMap.get(ch)==1 && !hashSet.contains(ch)){
                System.out.println(ch);
                hashSet.add(ch);
            }
        }
    }
}

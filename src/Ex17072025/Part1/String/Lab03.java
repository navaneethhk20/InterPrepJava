package Ex17072025.Part1.String;

import java.util.HashMap;
import java.util.HashSet;

public class Lab03 {
    public static void main(String[] args){
        //Print unique character
        String name ="rtrtuer";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: name.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }
        HashSet<Character> hashSet = new HashSet<>();
        for(char ch: name.toCharArray()){
            if(hashMap.get(ch)==1&&!hashSet.contains(ch)){
                System.out.println(ch+ " ");
                hashSet.add(ch);
            }
        }
    }
}

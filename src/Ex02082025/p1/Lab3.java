package Ex02082025.p1;

import java.util.HashMap;
import java.util.ArrayList;
public class Lab3 {
    public static void main(String[] args) {
        //print unique character
        String input ="navaneeth";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }
        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashmap.get(ch)==1 && !list.contains(ch)){
                System.out.print(ch+" ");
                list.add(ch);
            }
        }
    }
}

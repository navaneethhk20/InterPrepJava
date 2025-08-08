package Ex08082025.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class L14 {
    public static void main(String[] args) {
        //print first repeated or non repeated character
        String input= "swissai";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }
        ArrayList<Character>list= new ArrayList<>();
        for (char ch: input.toCharArray()){
            if(hashmap.get(ch)==1&&!list.contains(ch)){
                System.out.print(ch+" ");
                list.add(ch);
            }
        }
        System.out.println();
        System.out.println(list.get(0));
    }
}

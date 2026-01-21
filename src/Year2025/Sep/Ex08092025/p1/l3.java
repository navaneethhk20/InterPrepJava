package Year2025.Sep.Ex08092025.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class l3 {
    public static void main(String[] args) {
       String input="navneetha";
       HashMap<Character, Integer> map = new HashMap<>();
       for(char ch: input.toCharArray()){
           map.put(ch, map.getOrDefault(ch,0)+1);
       }
       ArrayList<Character> list= new ArrayList<>();
       for(char ch:input.toCharArray()){
           if(map.get(ch)==1 && !list.contains(ch)){
               list.add(ch);
           }
       }
System.out.println(list);
    }
}

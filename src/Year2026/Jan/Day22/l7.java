package Year2026.Jan.Day22;

import java.util.ArrayList;
import java.util.HashMap;

public class l7 {
    public static void main(String[] args) {
        String input="switchas switches que testing";
         HashMap<Character,Integer> map  = new HashMap<>();
         for (char ch: input.toCharArray()) {
             if (ch != ' ') {
                 map.put(ch, map.getOrDefault(ch, 0) + 1);
             }
         }
        ArrayList<Character> list =new ArrayList<>();
         for(char ch: input.toCharArray()) {
             if(ch!=' ') {
                 if (map.get(ch) == 1 && !list.contains(ch)) {
                     list.add(ch);
                 }
             }
         }
        System.out.println(list);
         int middlecount=list.size()/2;
         char middlechar =list.get(middlecount);
        System.out.println(middlechar);
    }
}

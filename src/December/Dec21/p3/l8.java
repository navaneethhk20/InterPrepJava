package December.Dec21.p3;

import java.util.ArrayList;
import java.util.HashMap;

public class l8 {
    public static void main(String[] args) {
        String input="saiwiss";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: input.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(map.get(ch)==1 && ! list.contains(ch)){
                list.add(ch);
            }
        }
        System.out.println(list);
        System.out.println(list.get(0));
    }
}

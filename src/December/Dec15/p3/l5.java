package December.Dec15.p3;

import java.util.ArrayList;
import java.util.HashMap;


public class l5 {
    public static void main(String[] args) {
        String input="twisst";

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch:input.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> list =new ArrayList<>();
        for(char ch:input.toCharArray()){
            if(hashMap.get(ch)>1 && !list.contains(ch)){
                list.add(ch);
            }
        }
        System.out.println(list);
        System.out.println(list.get(0));
    }
}

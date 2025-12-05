package August.Ex06082025.P1;

import java.util.ArrayList;
import java.util.HashMap;

public class Lab2 {
    public static void main(String[] args){
        String input="Switchas switches que testing";
        input= input.toLowerCase();
        HashMap<Character,Integer> hashmap= new HashMap<>();
        for(char ch:input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }
        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                if (hashmap.get(ch) == 1 && !list.contains(ch)) {
                    list.add(ch);
                }
            }
        }
        System.out.println(list.toString());
        System.out.println(list.get(0));
        int middlecount =list.size()/2;
        char middlechar=list.get(middlecount);
        System.out.println(middlechar);
    }
}

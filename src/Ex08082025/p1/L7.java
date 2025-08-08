package Ex08082025.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class L7 {
    public static void main(String[] args) {
        //print middle repeating and non repeatig character
        String input = "switchas switches que testing";

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character>list= new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(ch!=' ') {
                if (hashmap.get(ch) == 1 && !list.contains(ch)) {
                    list.add(ch);
                    System.out.print(ch + " ");
                }
            }
        }
        System.out.println();

        int middlenumber = list.size()/2;
        char middlechar = list.get(middlenumber);
        System.out.println(middlechar);

    }
}

package Ex24082025.p1;

import java.util.ArrayList;
import java.util.HashMap;
public class L3 {
    public static void main(String[] args){
        String input="navaneeth hosuru kumar";
        HashMap<Character,Integer> hashmap= new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                if (hashmap.get(ch) > 1 && !list.contains(ch)) {
                    list.add(ch);
                    System.out.print(ch + " ");
                }
            }
        }
    }
}

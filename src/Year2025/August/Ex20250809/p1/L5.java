package Year2025.August.Ex20250809.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class L5 {
    public static void main(String[] args) {
        //print unique characters
        String input="navaneeth h k";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character>list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(ch!=' ') {
                if (hashmap.get(ch) == 1 && !list.contains(ch)) {
                    list.add(ch);
                    System.out.print(ch + " ");
                }
            }
        }
        System.out.println();
        int middlenum= list.size()/2;
        char middle =list.get(middlenum);
        System.out.println(middle);
        System.out.println(list.get(0));
    }
}

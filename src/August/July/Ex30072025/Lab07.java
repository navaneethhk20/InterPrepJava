package August.July.Ex30072025;

import java.util.ArrayList;
import java.util.HashMap;

public class Lab07 {
    public static void main(String[] args){
        String input ="Switchas switches que testing";
        input = input.toLowerCase();

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){

                hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);

        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch:input.toCharArray()){
            if(ch!=' ') {
                if (hashmap.get(ch) == 1 && !list.contains(ch)) {
                    System.out.print(ch + " ");
                    list.add(ch);
                }
            }
        }
        System.out.println();
        list.toString();

        int middlenu = list.size()/2;
        char middle = list.get(middlenu);
        System.out.println(middle);

    }
}

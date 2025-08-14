package Ex14082025.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class l19 {
    public static void main(String[] args) {
        String input="switchas switches que testing";
        HashMap<Character,Integer> hashmap= new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()) {
            if(ch!=' ') {
                if (hashmap.get(ch) == 1 && !list.contains(ch)) {
                    System.out.print(ch + " ");
                    list.add(ch);
                }
            }
        }
        System.out.println();

        int middlenumuber= list.size()/2;
        char middlechar= list.get(middlenumuber);
        System.out.println(middlechar);
    }
}

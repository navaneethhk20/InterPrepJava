package Year2025.October.Oct09;

import java.util.ArrayList;
import java.util.HashMap;

public class l7 {
    public static void main(String[] args) {
        String input="Switchas switches que testing";
        input=input.toLowerCase();

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch : input.toCharArray()) {
            if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(ch!=' ') {
                if (hashMap.get(ch) == 1 && !list.contains(ch)) {
                    list.add(ch);
                }
            }
        }
        System.out.println(list);
        int middle= list.size()/2;
        char middlechar=list.get(middle);
        System.out.println(middlechar);
    }
}

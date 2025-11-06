package November.Nov06.p3;

import java.util.ArrayList;
import java.util.HashMap;

public class l7 {
    public static void main(String[] args) {
        String input = "Switchas switches que testing";
        input=input.toLowerCase();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()) {
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
        int count=list.size()/2;
        char charrater= list.get(count);
        System.out.println(charrater);
    }
}

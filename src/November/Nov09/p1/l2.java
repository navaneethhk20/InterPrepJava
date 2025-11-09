package November.Nov09.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class l2 {
    public static void main(String[] args) {
        String input="Software Services";
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            if(ch!=' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }
        ArrayList<Character> list = new ArrayList<>();
        for(char ch:input.toCharArray()){
            if(ch!=' ') {
                if (hashmap.get(ch) == 1 && !list.contains(ch)) {
                    list.add(ch);
                }
            }
        }

        System.out.println(list);
        System.out.println(list.get(0));
    //    System.out.println(list);
        int middle = list.size()/2;
        char middlechar=list.get(middle);
        int lastone=list.size()-1;
        char lastchar=list.get(lastone);
        System.out.println(lastchar);
        System.out.println(middlechar);
    }
}

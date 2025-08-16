package Ex16082025.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class p10 {
    public static void main(String[] args) {
        String input = "switchas switches que testing";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            if(ch!=' '){
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }
    }

        ArrayList<Character> list= new ArrayList<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                if (hashMap.get(ch) > 1 && !list.contains(ch)) {
                    System.out.print(ch + " ");
                    list.add(ch);
                }
            }

        }
        System.out.println();
        int middlecount = list.size()/2;
        char middlechar=list.get(middlecount);
        System.out.println(middlechar);
    }
}

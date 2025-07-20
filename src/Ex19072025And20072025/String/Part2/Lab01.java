package Ex19072025And20072025.String.Part2;

import java.util.ArrayList;
import java.util.HashMap;


public class Lab01 {
    public static void main(String[] args) {
        //print middle non repeating &&repeating character
        String input = "switaches switches que testing";
        input = input.toLowerCase();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> hashSet = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                if (hashMap.get(ch) == 1 && !hashSet.contains(ch)) {
                    hashSet.add(ch);
                }
            }
        }

        String list = hashSet.toString();
        System.out.println(list);

        int middlenumber = hashSet.size()/2;
        char middlechar = hashSet.get(middlenumber);
        System.out.println(middlechar);
    }
}

package August.July.Ex17072025.Part1.String;

import java.util.HashMap;
import java.util.HashSet;

public class Lab04 {
    public static void main(String[] args) {
        //print non unique character in a tring
        String name = "gdfrttdgcvtrvcgfd";

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : name.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        HashSet<Character> hashSet = new HashSet<>();
        for (char ch : name.toCharArray()) {
            if (hashMap.get(ch) > 1 && !hashSet.contains(ch)) {
                System.out.println(ch + " ");
                hashSet.add(ch);
            }
        }

    }

}

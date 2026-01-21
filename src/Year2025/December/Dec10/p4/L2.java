package Year2025.December.Dec10.p4;

import java.util.ArrayList;
import java.util.HashMap;

public class L2 {
    public static void main(String[] args) {
        String input = "Navaneethu";

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()) {
            if(hashMap.get(ch)==1 && !list.contains(ch)) {
                list.add(ch);
            }
        }
        StringBuilder sb =new StringBuilder();
        for(char str: list){
            sb.append(str);
        }
        System.out.println(sb.toString());
    }
}

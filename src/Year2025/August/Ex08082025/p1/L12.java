package Year2025.August.Ex08082025.p1;

import java.util.HashMap;

public class L12 {
    public static void main(String[] args) {
        //change the character
        String input = "tomorrow";

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= input.length()-1; i++) {
            char current =input.charAt(i);
            int frequency= hashmap.get(current);
            if(frequency==1 ||frequency==2){
                sb.append(current);
            }else {
                sb.append("$");
            }
        }
        System.out.println(sb.toString());
    }
}

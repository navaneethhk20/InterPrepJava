package Year2025.August.July.Ex19072025And20072025.String.Part3;

import java.util.HashMap;

public class Lab04 {
    public static void main(String[] args) {
        //count the no of characters
        String input = "ttest@!@#123ggg";

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println(hashMap.size());

    }
}

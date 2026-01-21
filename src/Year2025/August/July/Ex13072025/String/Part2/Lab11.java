package Year2025.August.July.Ex13072025.String.Part2;

import java.util.HashMap;

public class Lab11 {
    public static void main(String[] args) {
        String input = "tomorrow";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int frequency = hashMap.get(currentChar);


            if (frequency == 1) {
                sb.append(currentChar);
            } else {
                sb.append(frequency);
            }
        }
        String output = sb.toString();
        System.out.println(output);
    }

}

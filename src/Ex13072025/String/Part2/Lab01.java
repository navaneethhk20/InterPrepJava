package Ex13072025.String.Part2;

import java.util.ArrayList;
import java.util.HashMap;

public class Lab01 {
    public static void main(String[] args) {
        //print middle non repeating  character in string
        String input = "switchas switches que testing";

        System.out.println("String length: " + input.length());

        // Step 1: Count frequency of each character
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find all non-repeating characters (frequency = 1)
        ArrayList<Character> nonRepeating = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            if (charCount.get(ch) == 1) {
                if (!nonRepeating.contains(ch)) {  // Avoid duplicates in list
                    nonRepeating.add(ch);
                }
            }
        }

        System.out.println("Non-repeating characters: " + nonRepeating);
        System.out.println("Number of non-repeating characters: " + nonRepeating.size());

// Step 3: Find the middle non-repeating character
        if (nonRepeating.size() > 0) {
            int middleIndex = nonRepeating.size() / 2;
            char middleChar = nonRepeating.get(middleIndex);
            System.out.println("Middle non-repeating character: '" + middleChar + "'");
        } else {
            System.out.println("No non-repeating characters found");
        }
    }
}

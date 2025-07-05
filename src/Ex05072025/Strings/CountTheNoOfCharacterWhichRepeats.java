package Ex05072025.Strings;

import java.util.HashMap;

public class CountTheNoOfCharacterWhichRepeats {
    public static void main(String[] args) {
        //count the no of character which repeats
        String str =" Ramesh Sachin Tendulkar";
        str = str.toLowerCase();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        int repeatingCount = 0;
        for (int frequency : charCount.values()) {
            if (frequency > 1) {
                repeatingCount++;
            }
        }
        System.out.println(repeatingCount);
    }

}

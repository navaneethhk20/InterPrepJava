package August.July.Ex06072025.Strings;

import java.util.HashMap;

public class ReplaceCharWithOccurence {
    public static void main(String[] args) {
        //Input ="tomorrow";
        //output ="t3m3223w"
        //First we will find character and how many times they are repeating
        String str = "tomorrow";
        HashMap<Character, Integer> countChar = new HashMap<>();
        for (char ch : str.toCharArray()) {
            countChar.put(ch, countChar.getOrDefault(ch, 0) + 1);
        }

        //based on count build the string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int frequency = countChar.get(currentChar);


            //final stage if character is not repeating keep the same, if repeating replace with frequency

            if (frequency == 1){
                result.append(currentChar);
            }else {
                result.append(frequency);
            }
        }

        String output = result.toString();
        System.out.println(output);
    }
}

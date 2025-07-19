package Ex13072025.String.Part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab15 {

    public static void reverseCharsKeepSpaces(String str) {
        char[] result = str.toCharArray();

        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                chars.add(ch);
            }
        }
        Collections.reverse(chars);

        int index = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != ' ') {
                result[i] = chars.get(index++);
            }
        }
        System.out.println(result);
    }

        public static void main (String[]args){
            String str = "I am Not String";
            System.out.println(str);
            reverseCharsKeepSpaces(str);
        }
    }



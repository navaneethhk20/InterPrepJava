package Ex13072025.String;

import java.util.HashMap;
import java.util.Map;

public class Lab06 {
    public static void main(String[] args) {
        //ocuurence of each character
        String input = "Navaneeth Hosurukoppalu Kumar";
        input = input.toLowerCase();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch : input.toCharArray()){
            if (ch!=' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" occurs"+entry.getValue()+" times");
        }
    }
}

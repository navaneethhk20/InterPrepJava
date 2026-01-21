package Year2025.August.July.Ex13072025.String.Part1;

import java.util.HashMap;

public class Lab05 {
    public static void main(String[] args) {
        String input= "Navaneeth";
        input =input.toLowerCase();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch : input.toCharArray()) {
            if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }
        int repeatingcount=0;
        for(int frequency: hashMap.values()){
            if(frequency>1){
                repeatingcount++;
            }
        }
        System.out.println(repeatingcount);
    }
}

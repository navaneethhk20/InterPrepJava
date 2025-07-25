package Ex252627072025.Part1;

import java.util.ArrayList;
import java.util.HashMap;

public class Lab14 {
    public static void main(String[] args) {
        //replace the words with frequency in a string
        String input= "tomorrow";

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=input.length()-1;i++){
            char currentchar = input.charAt(i);
            int frequency = hashmap.get(currentchar);
            if(frequency==1){
                sb.append(currentchar);
            }else {
                sb.append(frequency);
            }
        }
        System.out.println(sb.toString());

    }
}

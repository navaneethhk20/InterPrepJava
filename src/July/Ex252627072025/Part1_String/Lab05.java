package July.Ex252627072025.Part1_String;

import java.util.HashMap;

public class Lab05 {
    //count the no of characters that occur repeatedly
    public static void main(String[] args){
        String input = "Narendra DamodarDas Modi";
        input = input.toLowerCase();

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
                if(ch!=' ') {
                    hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
                }
        }

        int repeatingcount=0;

        for(int frequency: hashmap.values()){
           if( frequency>1){
               repeatingcount++;
           }
        }
        System.out.println(repeatingcount);
    }
}

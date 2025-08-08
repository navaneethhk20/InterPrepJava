package Ex19072025.Part1;

import java.util.HashMap;

public class Lab04 {
    public static void main(String[] args){
        //count the no of characters the occurs repeatedly
        String input ="Hosurukoppalu";
        input = input.toLowerCase();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }


        int repeating =0;
        for(int frequency: hashMap.values()){
            if(frequency>1){
                repeating++;
            }

        }
        System.out.println(repeating);
    }
}

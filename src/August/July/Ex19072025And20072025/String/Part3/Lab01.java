package August.July.Ex19072025And20072025.String.Part3;

import java.util.ArrayList;
import java.util.HashMap;

public class Lab01 {
    public static void main(String[] args){
        //Print first non repeating word /repeating word
        String input ="Swiseraland";
        input = input.toLowerCase();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }

        ArrayList<Character> arrayList = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashMap.get(ch)>1 && !arrayList.contains(ch)){
                arrayList.add(ch);
            }
        }
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
    }

}

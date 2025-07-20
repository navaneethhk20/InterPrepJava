package Ex19072025And20072025.String.Part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Lab05 {
    public static void main(String[] args) {
        //remove repeating character from string
        String input= "nithin";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch : input.toCharArray()){
           hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }

        ArrayList arrayList = new ArrayList();
        for(char ch: input.toCharArray()){
            if(hashMap.get(ch)==1 && !arrayList.contains(ch)){
                System.out.print(ch+" ");
                arrayList.add(ch);
            }
        }
    }
}

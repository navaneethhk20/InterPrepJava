package Ex17072025.Part1.String;

import java.util.HashMap;
import java.util.Map;

public class Lab05 {
    public static void main(String[] args){
        //pritnt the character and occurence in a string
        String name ="Hassan Magge Gosurukoppalu";
        name = name.toLowerCase();

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: name.toCharArray()){
            if(ch!=' '){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }
        }

        for(Map.Entry<Character,Integer>entry:hashMap.entrySet()) {
            System.out.println(entry.getKey() + " occures " + entry.getValue() + " times.");
        }
    }
}

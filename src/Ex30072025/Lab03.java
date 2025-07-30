package Ex30072025;

import java.util.ArrayList;
import java.util.HashMap;

public class Lab03 {
    public static void main(String[] args){
        String input ="dcfvgbhnjbgvfcd";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashMap.get(ch)==1 &&!list.contains(ch)){
                System.out.print(ch+ " ");
                list.add(ch);
            }
        }
        //System.out.println(list);
    }
}

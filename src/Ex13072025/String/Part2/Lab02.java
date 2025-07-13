package Ex13072025.String.Part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Lab02 {
    public static void main(String[] args) {
        //print middle non repeating  character in string
        String input = "switchas switches que testing";

        //find occurence of each character
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (char ch: input.toCharArray()) {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }
//to find non repeatinf character
        ArrayList<Character> nonrepeating = new ArrayList<>();
        for (char ch: input.toCharArray()){
            if(hashMap.get(ch)==1){
                if(!nonrepeating.contains(ch)){
                    nonrepeating.add(ch);
                }
            }
        }
        System.out.println(nonrepeating);

        //to find middle value
        if(nonrepeating.size()>0) {
            int middleIndex = nonrepeating.size()/2;
            char middleChar = nonrepeating.get(middleIndex);
            System.out.println(middleChar);
        }else {
            System.out.println("not found");
        }





    }
}

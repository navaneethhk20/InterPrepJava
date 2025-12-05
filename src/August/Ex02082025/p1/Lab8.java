package August.Ex02082025.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class Lab8 {
    public static void main(String[] args) {
        //print middle repeating character
        String input ="switchas switches que testing";
        HashMap<Character,Integer> hash = new HashMap<>();
        for(char ch: input.toCharArray()){
            hash.put(ch, hash.getOrDefault(ch,0)+1);
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(ch!=' '){
            if(hash.get(ch)>1&&!list.contains(ch)) {
                System.out.println(ch);
                list.add(ch);
            }
            }
        }

        int middlecount = list.size()/2;
        char middlechar = list.get(middlecount);
        System.out.println("middle char is: "+middlechar);
    }
}

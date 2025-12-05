package August.Ex02082025.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class Lab9 {
    public static void main(String[] args) {
        //print middle non repeating character
        String input ="switchas switches que testing";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character>list =new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashMap.get(ch)==1&&!list.contains(ch)){
                System.out.print(ch+" ");
                list.add(ch);
            }
        }
        System.out.println();
        int middle = list.size()/2;
        char middlechar =list.get(middle);
        System.out.println(middlechar);

    }
}

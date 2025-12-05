package August.Ex21082025.p2;

import java.util.ArrayList;
import java.util.HashMap;

public class L7 {
    public static void main(String[] args) {
        String input ="swiszerlanrd";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character>list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(hashMap.get(ch)>1&&!list.contains(ch)){
                list.add(ch);
                System.out.print(ch+" ");
            }
        }
        System.out.println();
        System.out.println(list.get(0));
    }
}

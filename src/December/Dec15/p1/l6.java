package December.Dec15.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class l6 {
    public static void main(String[] args) {
       String input="switchas switches que testing";

       HashMap<Character,Integer> hashMap = new HashMap<>();
       for(char ch: input.toCharArray()){
           if(ch!=' '){
               hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
           }
       }

       ArrayList<Character> list = new ArrayList<>();
       for(char ch: input.toCharArray()) {
           if (ch != ' ') {
               if (hashMap.get(ch) ==1 && !list.contains(ch)) {
                   list.add(ch);
               }
           }
       }
           System.out.println(list);
    }
}




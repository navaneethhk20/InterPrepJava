package Ex19082025.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class l2 {
    public static void main(String[] args) {
        String input= "nithu hosuru kumar";
        HashMap<Character,Integer> hashMap= new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(ch!=' ') {
                if (hashMap.get(ch) == 1 && !list.contains(ch)) {
                    list.add(ch);
                    System.out.print(ch + " ");
                }
            }
        }
    }
}

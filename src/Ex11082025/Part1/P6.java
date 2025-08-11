package Ex11082025.Part1;

import java.util.ArrayList;
import java.util.HashMap;

public class P6 {
    public static void main(String[] args) {
        String input="switchas switches que testing";
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        ArrayList<Character> list= new ArrayList<>();
        for(char ch:input.toCharArray()){
            if(ch!=' '){
                if(hashmap.get(ch)==1&&!list.contains(ch)){
                    list.add(ch);
                    System.out.print(ch+" ");
                }
            }
        }
        System.out.println();
        System.out.println(list.get(0));

        int middlecount= list.size()/2;
        char middlechar=list.get(middlecount);
        System.out.println(middlechar);

    }
}

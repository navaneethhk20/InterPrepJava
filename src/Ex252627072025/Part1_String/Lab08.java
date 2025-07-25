package Ex252627072025.Part1_String;
import java.util.*;

public class Lab08 {
    public static void main(String[] args){
        //print middle repeating character in a string
        String input = "Switchas switches que testing";
        input = input.toLowerCase();

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }

       List<Character> list = new LinkedList<>();
        for(char ch: input.toCharArray()){
            if (ch != ' ') {
                if (hashmap.get(ch) > 1 && !list.contains(ch)) {
                    System.out.print(ch + " ");
                    list.add(ch);
                }
            }
        }
        System.out.println(" ");

        int middleint = list.size()/2;
        char middle = list.get(middleint);
        System.out.println(middle);


    }
}

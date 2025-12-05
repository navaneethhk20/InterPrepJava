package August.Ex02082025.p1;


import java.util.HashMap;

public class Lab5 {
    public static void main(String[] args){
        //count the repeating characters in string repeated
        String input ="Ramesh sachin tendulkar";
        input = input.toLowerCase();

        HashMap<Character,Integer> hashmap= new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }
        int repeatingcount =0;

        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                if (hashmap.get(ch) > 1 ) {
                    repeatingcount++;
                    System.out.print(ch+"");
                }
            }
        }
        System.out.println();

        System.out.println(repeatingcount);
    }
}

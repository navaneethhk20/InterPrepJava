package Ex252627072025.Part1_String;

import java.util.HashMap;

public class Lab14 {
    public static void main(String[] args) {
        //replace the words with frequency in a string
        String input= "tomorrow";

        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=input.length()-1;i++){
            char currentchar = input.charAt(i);
            int frequency = hashmap.get(currentchar);
            if(frequency==1 || frequency ==2){
                sb.append(currentchar);
            }else {
               // sb.append(frequency); t3m3223w
               // sb.append("$"); t$m$$$$w
                sb.append("$"); // || frequency ==2 ----- t$m$rr$w
            }
        }
        System.out.println(sb.toString());

    }
}

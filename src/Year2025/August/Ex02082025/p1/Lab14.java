package Year2025.August.Ex02082025.p1;

import java.util.HashMap;

public class Lab14 {
    public static void main(String[] args) {
        //print $ for non unique character in a string
        String input ="tomorrow";
        HashMap<Character, Integer> hashamap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashamap.put(ch,hashamap.getOrDefault(ch, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=input.length()-1;i++){
            char currentchar = input.charAt(i);
            int frequency= hashamap.get(currentchar);
            if(frequency==1){
             sb.append(currentchar);
            }else {
                sb.append("$");
            }
        }
        System.out.println(sb.toString());
    }
}

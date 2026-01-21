package Year2025.August.July.Ex13072025.String.Part2;

import java.util.HashMap;

public class Lab12 {
    public static void main(String[] args) {
        String name = "navaneeth";

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (char ch: name.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i =0; i<name.length();i++){
            char currentchar = name.charAt(i);
            int frequency = hashMap.get(currentchar);

            if(frequency==1){
                sb.append(currentchar);
            }else {
                sb.append(frequency);
            }
        }
        String output = sb.toString();
        System.out.println(output);
    }
}

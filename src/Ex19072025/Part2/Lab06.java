package Ex19072025.Part2;

import java.util.HashMap;

public class Lab06 {
    public static void main(String[] args) {
        String input ="tomorrow";
        //output ="t3m3223w"
        //output ="t$m$$$$w"

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=input.length()-1;i++){
            char currentchar = input.charAt(i);
            int frequency = hashMap.get(currentchar);
            if(frequency==1){
                sb.append(currentchar);
            }else {
                //sb.append(frequency);
                sb.append("$");
            }
        }

        String output = sb.toString();
        System.out.println(output);

    }
}

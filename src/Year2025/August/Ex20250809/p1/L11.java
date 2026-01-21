package Year2025.August.Ex20250809.p1;

import java.util.HashMap;

public class L11 {
    public static void main(String[] args) {
        String input="tomorrow";

        StringBuilder sb = new StringBuilder();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<=input.length()-1;i++){
            char currentchar= input.charAt(i);
            int freqency= hashMap.get(currentchar);
            if(freqency==1|| freqency==2){
                sb.append(currentchar);
            }else {
                sb.append(freqency);
            }
        }
        System.out.println(sb.toString());
    }
}

package Year2025.August.EX28082025.p2;

import java.util.HashMap;

public class L1 {
    public static void main(String[] args) {
        String input="tomorrow";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=input.length()-1;i++){
            char currentchar= input.charAt(i);
            int frewuency=hashMap.get(currentchar);
            if(frewuency==1 || frewuency==2){
                sb.append(currentchar);
            }else {
                sb.append("$");
            }
        }
        System.out.println(sb.toString());
    }
}

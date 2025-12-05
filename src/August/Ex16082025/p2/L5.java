package August.Ex16082025.p2;

import java.util.HashMap;

public class L5 {
    public static void main(String[] args) {
        String input="TOMORROW";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: input.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=input.length()-1;i++){
            char currentchar = input.charAt(i);
            int frequency= map.get(currentchar);
            if(frequency==1 || frequency==2){
                sb.append(currentchar);
            }else {
                sb.append("$");
            }
        }
        System.out.println(sb.toString());
    }
}

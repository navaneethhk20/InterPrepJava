package November.Nov09.p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class l3 {
    public static void main(String[] args) {
        //String input="bananas";
        String input="Proggrammmming";
        HashMap<Character,Integer> hashMap= new HashMap<>();
        for(char ch: input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
        }

        ArrayList<Character>list= new ArrayList<>();
        for(char ch:input.toCharArray()){
            if(hashMap.get(ch)>1 && !list.contains(ch)){
                list.add(ch);
            }
        }
        for(char ch:list){
            System.out.println(ch+" occurs "+ hashMap.get(ch));
        }
//        StringBuilder sb= new StringBuilder();
//        for(char str:list){
//            sb.append(str);
//        }
//        System.out.println(sb.toString());
    }
}

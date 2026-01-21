package Year2025.November.Nov10.p1;
import java.util.ArrayList;
import java.util.HashMap;

public class l3 {
    public static void main(String[] args) {
        String input="gergerweqewegdvdsaw";
        HashMap<Character,Integer> hashmap= new HashMap<>();
        for(char ch: input.toCharArray()){
            hashmap.put(ch, hashmap .getOrDefault(ch,0)+1);
        }

        ArrayList<Character> list = new ArrayList<>();
        for(char ch:input.toCharArray()){
            if(hashmap.get(ch)==1 &&!list.contains(ch)){
                list.add(ch);
            }
        }
        System.out.println(list);
//        System.out.println(list.get(1));
//        int middle=list.size()/6;
//        char middlechar= list.get(middle);
//        System.out.println(middlechar);
        StringBuilder sb=new StringBuilder();
        for(char ch:list){
            sb.append(ch);
        }
        System.out.println(sb.toString());

    }
}

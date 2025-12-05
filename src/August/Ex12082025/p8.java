package August.Ex12082025;
import java.util.ArrayList;
import java.util.HashMap;
public class p8 {
    public static void main(String[] args) {
        String input= "switchas switches que testing";
        HashMap<Character,Integer>hashmap = new HashMap<>();
        for(char ch: input.toCharArray()) {
            if(ch!=' '){
                hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
            }
        }

        ArrayList<Character>list= new ArrayList<>();
        for(char ch: input.toCharArray()) {
            if (ch != ' ') {
                if (hashmap.get(ch) == 1 && !list.contains(ch)) {
                    list.add(ch);
                }
            }
        }
        System.out.println(list);
        int middlenum=list.size()/2;
        char middlechar= list.get(middlenum);
        System.out.println(middlechar);
    }
}

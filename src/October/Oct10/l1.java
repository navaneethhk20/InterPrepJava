package October.Oct10;
import java.util.HashMap;
public class l1 {
    public static void main(String[] args) {
        String[] s1={"nithu","hk","kite","polu","goat"};
        String[] s2={"bantu","puttu","kite","goat","side"};

        HashMap<String, Integer> hashmap = new HashMap<>();
        for(String common: s1){
            hashmap.put(common,1);
        }
        for(String common:s2){
            if(hashmap.containsKey(common)){
                System.out.println(common);
            }
        }
    }
}

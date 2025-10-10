package October.Oct10;

import java.util.HashMap;

public class l2 {
    public static void main(String[] args) {
        String[] s1={"nithu","hk","kite","polu","goat"};
        String[] s2={"bantu","puttu","kite","goat","side"};

        HashMap<String, Boolean> hashmap = new HashMap<>();
        for(String add:s1){
            hashmap.put(add,true);
        }
        for(String add:s2){
            hashmap.put(add,true);
        }

        for(String str: hashmap.keySet()){
            System.out.print(str+" ");
        }
    }
}

package October.oct24.p2;

import java.util.HashMap;

public class l2 {
    public static void main(String[] args) {
        String[] s1={"rwe","ytr","kng","pof"};
        String[] s2={"Fsdf","ewqe","kng","ferw"};

        HashMap<String,Integer> hashmap = new HashMap<>();
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

package Year2025.November.Nov10.p2;

import java.util.HashMap;

public class l10 {
    public static void main(String[] args) {
        String[] s1={"fwdsf","Gbndf","vadfqwe","Vrt","nuy"};
        String[] s2={"few","bntr","bvre","Bny5e","Be","nuy"};

        HashMap<String,Boolean> hashmap = new HashMap<>();
        for(String common:s1){
            hashmap.put(common,true);
        }
        for(String common:s2){
            hashmap.put(common,true);
        }

        for(String str: hashmap.keySet()){
            System.out.println(str);
        }
    }
}

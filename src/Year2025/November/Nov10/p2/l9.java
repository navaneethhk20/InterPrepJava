package Year2025.November.Nov10.p2;

import java.util.HashMap;

public class l9 {
    public static void main(String[] args) {
        String[] s1={"fwdsf","Gbndf","vadfqwe","Vrt","nuy"};
        String[] s2={"few","bntr","bvre","Bny5e","Be","nuy"};

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String common:s1){
            hashMap.put(common,1);
        }
        for(String common:s2){
            if(hashMap.containsKey(common)){
                System.out.println(common);
            }
        }
    }
}

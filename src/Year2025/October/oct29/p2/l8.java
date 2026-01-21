package Year2025.October.oct29.p2;

import java.util.HashMap;

public class l8 {
    public static void main(String[] args) {
        String[] s1={"ger","vsda","hytr","poi","fwe"};
        String [] s2={"rtewr","jtr","bdf","hertre","poi"};

        HashMap<String,Integer> hashmap = new HashMap<>();
        for(String common:s1 ){
            hashmap.put(common,1);
        }
        for(String common: s2){
            if(hashmap.containsKey(common)){
                System.out.println(common);
            }
        }
    }
}

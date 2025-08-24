package Ex24082025.p3;

import java.util.HashMap;
import java.util.Map;

public class L4 {
    public static void main(String[] args) {
        int [] arr={53,543,654,76,54,342,144,586,543,241,387,463,595,443,442,445,642,745,244,346,432,432};

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}

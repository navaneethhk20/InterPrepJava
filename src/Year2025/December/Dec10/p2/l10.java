package Year2025.December.Dec10.p2;

import java.util.HashMap;
import java.util.Map;

public class l10 {
    public static void main(String[] args) {
        int[] arr={12,31,25,63,84,56,64,83,22,52,22,436,49,58,66,5732,81,29,263,33,5};

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }


        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}

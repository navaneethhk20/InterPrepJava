package Year2025.August.Ex20250809.p2;

import java.util.HashMap;
import java.util.Map;

public class L8 {
    public static void main(String[] args) {
        int[]arr={1,3,2,5,4,5,4,7,8,5,52,1,4,4,7,8,5,4,5,5,56,65,8,4};
        HashMap<Integer,Integer>hashMap = new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer>entry:hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}

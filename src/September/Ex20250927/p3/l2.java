package September.Ex20250927.p3;

import java.util.HashMap;
import java.util.Map;

public class l2 {
    public static void main(String[] args) {
        int[] arr={23,4543,67,5686,53,432,326,456,887,989,89,98767,7554,643,54,32,432};
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

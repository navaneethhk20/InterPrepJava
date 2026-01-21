package Year2025.August.Ex16082025.p2;

import java.util.HashMap;
import java.util.Map;

public class l8 {
    public static void main(String[] args) {
        int[] arr={635,21,32,625,8,54,352,342,615,56,52,5448,98,65,323,241,54,81,65,32,281,75,86,978,4754};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer>entry: hashMap.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}

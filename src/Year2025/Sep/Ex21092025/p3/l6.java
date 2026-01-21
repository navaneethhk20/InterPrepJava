package Year2025.Sep.Ex21092025.p3;

import java.util.HashMap;
import java.util.Map;

public class l6 {
    public static void main(String[] args) {
        int[] arr={2,10,4,50,75,8,96,90,87,50,38,2,59,67,8};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num: arr){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}

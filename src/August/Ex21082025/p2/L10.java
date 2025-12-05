package August.Ex21082025.p2;

import java.util.HashMap;
import java.util.Map;

public class L10 {
    public static void main(String[] args) {
        int [] arr={543,534,54,64,534,645,34,432};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer>entry: hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}

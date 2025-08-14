package Ex14082025.p1;

import java.util.HashMap;
import java.util.Map;

public class l2 {
    public static void main(String[] args) {
        int[] arr={4,5,7,1,2,4,5};
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer>entry: hashMap.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}

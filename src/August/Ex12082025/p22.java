package August.Ex12082025;

import java.util.HashMap;
import java.util.Map;

public class p22 {
    public static void main(String[] args) {
        int [] arr={4,5,6,4,8,89,2,4,7,7,8,9,6,3,2,1,4,5,2,4,7,9,6,3,2,14,47};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num: arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry: hashMap.entrySet()){
           if(entry.getValue()>1){
               System.out.print(entry.getKey()+" ");
           }
        }
    }
}

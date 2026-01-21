package Year2025.Sep.Ex16092025.p3;
import java.util.HashMap;
import java.util.Map;

public class l6 {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,8,9,7,76,5,4,3,2,1};

        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int num:arr){
            hashmap.put(num, hashmap.getOrDefault(num,0)+1);
        }



        for(Map.Entry<Integer,Integer>entry: hashmap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}

package October.oct29.p3;

import java.util.HashMap;
import java.util.Map;

public class l4 {
    public static void main(String[] args) {
        int[] arr={43,654,7,87,34,324,6,765,87,879,43,32,21,432,65,6778,87987,654,343};

        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int num: arr){
            hashmap.put(num, hashmap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: hashmap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}

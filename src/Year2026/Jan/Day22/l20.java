package Year2026.Jan.Day22;

import java.util.ArrayList;
import java.util.HashMap;

public class l20 {
    public static void main(String[] args) {
        int[] arr={1,24,54,75,78,96,74,253,23,12,32,66,56,27,38,59,998,97,57,426,54,34,43};

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        ArrayList<Integer>list = new ArrayList<>();
        for(int num:arr){
            if(hashMap.get(num)>1 && !list.contains(num)){
                list.add(num);
            }
        }
        System.out.println(list);
    }
}

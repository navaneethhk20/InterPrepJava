package Year2025.August.Ex2508202526082025.P2;

import java.util.HashMap;
import java.util.Map;

public class L10 {
    public static void main(String[] args) {
        int[] arr={543,654,65,76,768,6756,45,3422,3144,35,465,756,565,4,65,32,766,8987,76};

        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for(int num: arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

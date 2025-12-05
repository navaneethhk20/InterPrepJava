package August.July.Ex19072025And20072025.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Lab05 {
    public static void main(String[] args) {
        //print fisrt repeating & non repeating in an array
        int[] arr ={4,5,35,4,23,21,564,65,76,54,53,432,54,65,6,75,4,3,64,4,5,43,5,65,76,76,67,87,87};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num: arr){
            hashMap.put(num , hashMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer>entry: hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey()+ " ");
            }
        }
        System.out.println();


        for(int num : arr) {
            if(hashMap.get(num) > 1) {
                System.out.println(num);
                break;
            }
        }
    }
}

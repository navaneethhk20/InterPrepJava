package July.Ex252627072025.Part2_Arrays;

import java.util.HashMap;
import java.util.Map;

public class Lab13 {
    public static void main(String[] args) {
        //first repeating & non repeating element in an array
        int[] arr= {1,2,23,3,2,45,6,7,6};

        HashMap<Integer , Integer>hashMap = new HashMap<>();
        for(int num: arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
            }
        }
        System.out.println();

        for(int num:arr){
            if(hashMap.get(num)==1){
                System.out.println(num);
                break;
            }
        }
    }
}

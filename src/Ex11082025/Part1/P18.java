package Ex11082025.Part1;

import java.util.HashMap;
import java.util.Map;

public class P18 {
    public static void main(String[] args) {
        int[] arr = {5456, 45, 27, 5412, 2,21, 23, 5, 45, 78, 98, 65, 6, 3, 21, 245, 78, 89, 98, 65, 5, 11, 4, 48};
int target=68;

//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for(int num: arr){
//            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
//        }
//        for(Map.Entry<Integer,Integer>entry: hashMap.entrySet()){
//            if(entry.getValue()>1) {
//                System.out.println(entry.getKey());
//            }
//        }

        for(int i=0;i<=arr.length-1;i++){
            for (int j=i+1;j<= arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(target+" values indecis are present at "+i+" and "+j);
                }
            }
        }
    }
}
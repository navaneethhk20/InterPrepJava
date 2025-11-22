package November.Nov22.p3;

import java.util.HashMap;


public class l2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,4,6,7,8,9};

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num:arr2){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }
        for(int num:arr1){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        for(int key:hashMap.keySet()){
            if(hashMap.get(key)==1)
            System.out.println(key);
        }




    }
}

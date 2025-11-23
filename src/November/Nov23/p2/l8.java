package November.Nov23.p2;

import java.util.HashMap;

public class l8 {
    public static void main(String[] args) {
        int[] ar = {1, 4, 2,3,5};
        int[] brr = {1, 2, 3, 4};

//        for (int i = 0; i <= ar.length - 1; i++) {
//
//            for (int j = 0; j <= brr.length - 1; j++) {
//                if (ar[i] == brr[j]) {
//                    System.out.println(ar[i]);
//                    break;
//
//                }
//            }
//        }

        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int num: ar){
            hashmap.put(num, hashmap.getOrDefault(num,0)+1);
        }
        for(int num: brr){
            hashmap.put(num, hashmap.getOrDefault(num,0)+1);
        }

        for(int noncommon: hashmap.keySet()){
            if(hashmap.get(noncommon)>1){
                System.out.println(noncommon);
            }
        }

    }
}

package December.Dec31.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class l10 {
    public static void main(String[] args) {
        int[] arr={4,8,7,4,6,252,13,11,22,5,9,81,7,44,8,855,77,44,22,66,3,2,1};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list =new ArrayList<>();
        for (int num:arr){
            if(hashMap.get(num)>1 && !list.contains(num)) {
                list.add(num);
            }
          //break;
        }
        System.out.println(list);

    }
}

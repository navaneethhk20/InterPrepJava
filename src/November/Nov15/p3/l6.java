package November.Nov15.p3;

import java.util.ArrayList;
import java.util.HashMap;

public class l6 {
    public static void main(String[] args) {
        int [] arr={11,22,43,6,47,585,7,65,64,3,4,41,56,7};

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list =new ArrayList<Integer>();
        for (int num:arr)
            if (hashMap.get(num) > 1 && !list.contains(num)) {
                list.add(num);
            }
        System.out.println(list);
    }
}

package December.Dec15.p2;

import java.util.ArrayList;
import java.util.HashMap;

public class l8 {
    public static void main(String[] args) {
        int[] arr={1,2,54,35,17,28,29,92,38,364,674,47,93,94,75,674,82,92,90};

        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int num:arr){
            hashmap.put(num,hashmap.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list= new ArrayList<>();
        for(int num:arr){
            if(hashmap.get(num)>1 && !list.contains(num)){
                list.add(num);
            }
        }
        System.out.println(list);
    }
}

package December.Dec21.p3;

import java.util.ArrayList;
import java.util.HashMap;

public class l2 {
    public static void main(String[] args) {
        int [] arr={12,3,43,5,67,32,765,53,323,3233,34,56,76,87,54,4,32,43};

        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int num:arr){
            hashmap.put(num, hashmap.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> liat = new ArrayList<>();
        for(int num:arr){
            if(hashmap.get(num)>1 && !liat.contains(num)){
                liat.add(num);
            }
        }
        System.out.println(liat);
    }
}

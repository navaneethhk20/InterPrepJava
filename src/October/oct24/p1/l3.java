package October.oct24.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class l3 {
    public static void main(String[] args) {
        int [] arr={43,6,87,98,9,67,56,45,34,32,435,6,76,87,8,8967,34,5,54,4,43,456,3};

        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int num: arr){
            hashmap.put(num, hashmap.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int num:arr){
            if(hashmap.get(num)>1 &&!list.contains(num)){
                list.add(num);
            }
        }
        System.out.println(list);
    }
}

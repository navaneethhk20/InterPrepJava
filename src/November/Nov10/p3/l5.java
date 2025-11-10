package November.Nov10.p3;

import java.util.ArrayList;
import java.util.HashMap;

public class l5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,3,5,9};
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(int num:arr){
            if(hashMap.get(num)>1 &&!list.contains(num)){
                list.add(num);
            }
        }
        System.out.println(list);
    }
}

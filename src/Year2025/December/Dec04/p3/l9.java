package Year2025.December.Dec04.p3;

import java.util.ArrayList;

import java.util.HashMap;

public class l9 {
    public static void main(String[] args) {
        int[] arr={4,3,2,56,8,99,6,1,2,34,56,89};

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num:arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr){
            if(hashMap.get(num)>1 && !list.contains(num)){
                list.add(num);

            }
        }
        System.out.println(list);
    }
}

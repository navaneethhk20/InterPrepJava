package October.oct25.p3;

import java.util.ArrayList;
import java.util.HashMap;

public class l8 {
    public static void main(String[] args) {
        int[] arr={543,65,876,23,54,765,87,678,453,2341,231,54,654,765,3};
//        HashMap<Integer,Integer> hashmap = new HashMap<>();
//        for(int num: arr){
//            hashmap.put(num, hashmap.getOrDefault(num,0)+1);
//        }
//
//        ArrayList<Integer> list= new ArrayList<>();
//        for(int num:arr){
//            if(hashmap.get(num)>1 &&!list.contains(num)) {
//                list.add(num);
//            }
//        }
//        System.out.println(list);

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}

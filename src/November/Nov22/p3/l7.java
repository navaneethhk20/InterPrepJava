package November.Nov22.p3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class l7 {
    public static void main(String[] args) {
        int[] arr={1,3,45,7,87,534,3,54,6,78,89,675,5,32,12,12,123,234,54,56,67,87,809};
//        for(int i=0;i<=arr.length-1;i++){
//            for(int j=i+1;j<=arr.length-1;j++){
//                if(arr[i]==arr[j]){
//                    System.out.print(arr[i]+",");
//                }
//            }
//        }

//        HashSet<Integer> set=new HashSet<>();
//        for(int num:arr){
//            set.add(num);
//        }
//        System.out.println(set);

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num: arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int num:arr){
            if(hashMap.get(num)>1 &&!list.contains(num)){
                list.add(num);
            }
        }
        System.out.println(list);
    }
}

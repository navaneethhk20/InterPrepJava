package November.Nov06.p2;

import java.util.ArrayList;
import java.util.HashMap;

public class l10 {
    public static void main(String[] args) {
        int[] arr={423,54,75,68,675,43,234,1231,2,33,12,615,432,3,65,65,787,6};
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for(int num: arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr){
            if(hashMap.get(num)>1 && ! list.contains(num)){
                list.add(num);
            }
        }
        System.out.println(list);
    }
}

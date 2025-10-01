package October.Oct01.p3;

import java.util.HashMap;
import java.util.Map;

public class l4 {
    public static void main(String[] args) {
        int[] arr={543,654,756,643,12,423,634,756,86,879,98,89,98,6,32432,32,3567,758,869,987,9876,43,420};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num: arr){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}

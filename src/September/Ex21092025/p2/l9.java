package September.Ex21092025.p2;

import java.util.LinkedHashSet;

public class l9 {
    public static void main(String[] args) {
        int[] arr={200,5,554,7,947,5840};
        int [] arr2={1,3000,5,745,652,8};

       LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for(int num: arr){
            hashSet.add(num);
        }

        for(int num: arr2){
            hashSet.add(num);
        }
        System.out.println(hashSet);
    }
}

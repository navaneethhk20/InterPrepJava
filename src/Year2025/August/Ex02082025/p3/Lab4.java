package Year2025.August.Ex02082025.p3;

import java.util.HashSet;

public class Lab4 {
    public static void main(String[] args) {
        //add two array and remove duplicates
        int[] arr1={4,5,6,8,9,10};
        int[] arr2={1,3,5,2,7,8,9};

        HashSet<Integer>hashSet = new HashSet<>();
        for(int num:arr1){
            hashSet.add(num);
        }
        for(int num:arr2){
            hashSet.add(num);
        }
        System.out.println(hashSet.toString());
    }
}

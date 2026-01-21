package Year2025.December.Dec10.p3;

import java.util.HashSet;

public class l3 {
    public static void main(String[] args) {
        int[] arr1={3,5,6,7,8,9,2,1};
        int[] arr2={4,6,7,9,0,2,1,4};

        HashSet<Integer> hashSet = new HashSet<>();
        for(int num:arr1){
            hashSet.add(num);
        }

        for(int num:arr2){
            hashSet.add(num);
        }

        System.out.println(hashSet);
    }
}

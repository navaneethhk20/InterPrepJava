package Year2025.November.Nov22.p3;

import java.util.HashSet;

public class l1 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,4,6,7,8,9};

        HashSet<Integer> set = new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}

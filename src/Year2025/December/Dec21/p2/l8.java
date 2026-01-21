package Year2025.December.Dec21.p2;

import java.util.TreeSet;

public class l8 {
    public static void main(String[] args) {
        int[] arr1={12,4,56,7,9,9,6,4,3};
        int[] arr2={3,4,5,7,8,9,5,3,2};

        TreeSet<Integer> set = new TreeSet<>();
        for(int num:arr1){
            set.add(num);
        }

        for(int num:arr2){
            set.add(num);
        }

        System.out.println(set);
    }
}

package Year2025.December.Dec04.p3;

import java.util.HashSet;

public class l1 {
    public static void main(String[] args) {
        int[] arr={13,5,6,8,9,2,3,2};
        int[] arr2={2,3,4,5,6,7,8,3};

            HashSet<Integer> set= new HashSet<>();
            for(int sum: arr){
                set.add(sum);
            }

            for(int sum: arr2){
                set.add(sum);
            }
        System.out.println(set);
    }
}

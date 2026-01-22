package Year2026.Jan.Day22;

import java.util.HashSet;

public class l21 {
    public static void main(String[] args) {
        int[] arr1={1,3,6,7,8,9};
        int[] arr2={2,3,5,4,6,8,9};

        HashSet<Integer> set = new HashSet<>();
        for(int num: arr1){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}

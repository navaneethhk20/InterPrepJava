package Year2025.October.Oct13.p3;

import java.util.TreeSet;

public class l6 {
    public static void main(String[] args) {
        int []arr={4,8,6,2,3,9};
        int[] arr2={1,5,7,8,9,5,3};

        TreeSet<Integer> set = new TreeSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}

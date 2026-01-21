package Year2025.October.oct25.p3;

import java.util.TreeSet;

public class l4 {
    public static void main(String[] args) {
        int [] arr1={3,5,6,7,9,1,2};
        int[] arr2={5,6,7,9,4,2,0,6};
        TreeSet<Integer> set= new TreeSet<>();
        for(int num:arr1){
            set.add(num);
        }

        for(int num2:arr2){
            set.add(num2);
        }
        System.out.println(set);
    }
}

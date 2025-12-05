package September.Ex09092025;

import java.util.TreeSet;

public class l5 {
    public static void main(String[] args) {
        int []arr1={3,5,7,9,6,2,8};
        int[] arr2={4,1,3,6,7,9,2};

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

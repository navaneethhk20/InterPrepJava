package January26.p1;

import java.util.HashSet;
import java.util.TreeSet;

public class l1 {
    public static void main(String[] args){
        int[] arr={2,4,6,7,8,97,6,5,4,2};
        int[] arr1={3,4,5,7,8,9,0,64,3,2,2};

        TreeSet<Integer> hashset = new TreeSet<>();
        for(int num:arr){
            hashset.add(num);
        }

        for(int num:arr1){
            hashset.add(num);
        }
        System.out.println(hashset);
    }
}

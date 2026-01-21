package Year2025.October.oct29.p2;

import java.util.TreeSet;

public class l7 {
    public static void main(String[] args) {
        int [] arr={3,5,7,8,0,1,2};
        int[] arr2={2,4,6,7,8,9,0};

        TreeSet<Integer> set = new TreeSet<>();
        for(int num: arr){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}

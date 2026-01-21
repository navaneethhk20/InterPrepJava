package Year2025.October.Oct01.p2;

import java.util.TreeSet;

public class l9 {
    public static void main(String[] args) {
        int [] arr1={2,4,6,8,0,9,7,6,5,4,3};
        int [] arr2={1,3,5,7,8,9,0,7,6,5};
        TreeSet<Integer> set= new TreeSet<>();
        for(int num: arr1){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}

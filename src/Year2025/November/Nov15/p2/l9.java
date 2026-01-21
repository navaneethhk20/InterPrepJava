package Year2025.November.Nov15.p2;

import java.util.HashSet;

public class l9 {
    public static void main(String[] args) {
        int[] arr={1,4,3,6,8,9,0};
        int[] arr2={2,4,5,6,7,8};

        HashSet<Integer> set= new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int num: arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}

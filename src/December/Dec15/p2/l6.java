package December.Dec15.p2;

import java.util.HashSet;

public class l6 {
    public static void main(String[] args) {
        int[] arr={12,4,5,6,7,4,6};
        int[] arr2={2,3,5,7,8,9,9};
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }

        for(int num2:arr2){
            set.add(num2);
        }

        System.out.println(set);
    }
}

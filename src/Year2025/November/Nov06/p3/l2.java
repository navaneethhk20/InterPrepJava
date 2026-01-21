package Year2025.November.Nov06.p3;

import java.util.TreeSet;

public class l2 {
    public static void main(String[] args) {
        int[] arr1={2,4,6,7,8,9,0};
        int[] arr2={1,3,5,6,7,8,9};

        TreeSet<Integer> set = new TreeSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num2: arr2){
            set.add(num2);
        }
        System.out.println(set);
    }
}

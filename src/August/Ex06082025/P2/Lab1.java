package August.Ex06082025.P2;

import java.util.HashSet;


public class Lab1 {
    public static void main(String[] args) {
        int[] arr1={1,5,2,3,4,5,6};
        int[] arr2={2,8,7,9,6,5,4};

        HashSet<Integer> set = new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}

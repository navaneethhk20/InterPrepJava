package EX28082025.p3;

import java.util.HashSet;

public class L10 {
    public static void main(String[] args) {
        int[] arr1={1,4,9,6,7,3};
        int [] arr2={2,5,8,9,4,6};

        HashSet<Integer> list= new HashSet<>();
        for(int num:arr1){
            list.add(num);
        }
        for(int num:arr2){
            list.add(num);
        }
        System.out.println(list);
    }
}

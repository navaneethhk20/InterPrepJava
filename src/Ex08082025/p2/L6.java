package Ex08082025.p2;

import java.util.TreeSet;

public class L6 {
    public static void main(String[] args) {
        //add two arrays and remove duplicate
        int[] arr1={1,2,3,3,4,5};
        int[] arr2 ={3,6,7,8,9,3};
        TreeSet<Integer> set= new TreeSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for (int num:arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}

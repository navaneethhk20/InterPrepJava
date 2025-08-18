package Ex18082025.p2;

import java.util.TreeSet;

public class l6 {
    public static void main(String[] args) {
        int [] arr={4,5,8,2,6,7};
        int[] arr2={2,8,7,1,3,2,9};
        TreeSet<Integer> set= new TreeSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}

package Ex2508202526082025.P2;

import java.util.TreeSet;

public class L8 {
    public static void main(String[] args) {
        int[]arr1={3,6,4,2,7,4,3,2};
        int [] arr2={3,5,2,7,9,8,1,10,6,4};
        TreeSet<Integer>list = new TreeSet<>();
        for(int num: arr1){
            list.add(num);
        }
        for(int num: arr2){
            list.add(num);
        }
        System.out.println(list);
    }
}

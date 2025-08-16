package Ex16082025.p2;

import java.util.ArrayList;
import java.util.HashSet;

public class L10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};
        HashSet<Integer> list = new HashSet<>();
        for(int num:arr){
            list.add(num);
        }
        for(int num:arr2){
            list.add(num);
        }
        System.out.println(list);
    }
}

package Year2025.August.Ex12082025;

import java.util.TreeSet;

public class p19 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6,7,8,90};
        int[] arr2={4,5,6,8,4,2,3,6,9,7};
        TreeSet<Integer> list= new TreeSet<>();
        for(int num:arr1){
            list.add(num);
        }
        for(int num:arr2){
            list.add(num);
        }
        System.out.println(list);
    }
}

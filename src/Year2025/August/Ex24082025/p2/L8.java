package Year2025.August.Ex24082025.p2;

import java.util.TreeSet;

public class L8 {
    public static void main(String[] args) {
        int []arr={7,5,2,1,3,6,8,9};
        int[] arr2={1,2,4,5,8,3,2,5,7,9};
        TreeSet<Integer> list= new TreeSet<>();
        for(int num: arr){
            list.add(num);
        }
        for (int num: arr2){
            list.add(num);
        }
        System.out.println(list);
    }
}

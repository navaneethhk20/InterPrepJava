package Ex20250927.p2;

import java.util.TreeSet;

public class l8 {
    public static void main(String[] args) {
        int [] arr={1,4,6,7,8,9,0};
        int [] arr2={2,4,6,9,3,5};

        TreeSet<Integer> list = new TreeSet<>();
        for(int num:arr){
            list.add(num);
        }
        for(int num:arr2){
            list.add(num);
        }
        System.out.println(list);
    }
}

package September.Ex16092025.p2;

import java.util.HashSet;

public class l8 {
    public static void main(String[] args) {
        int [] arr={4,6,8,0,2,3,7,9};
        int [] arr2={1,3,5,7,9,0,6,2};

        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}

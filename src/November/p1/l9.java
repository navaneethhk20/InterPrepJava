package November.p1;

import java.util.HashSet;

public class l9 {
    public static void main(String[] args) {
        int[] arr={3,6,9,6,0,1,2};
        int [] arr2={4,0,6,9,8,2,1};

        HashSet<Integer> hashSet = new HashSet<>();
        for(int aa: arr){
            hashSet.add(aa);
        }

        for(int bb: arr2){
            hashSet.add(bb);
        }

        System.out.println(hashSet);
    }
}

package December.Dec16.p3;

import java.util.HashSet;

public class l3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr2={2,4,6,7,8,9,0};

        HashSet<Integer> set = new HashSet<>();
        for(int num:arr2){
            set.add(num);
        }

        for(int num:arr){
            if(!set.contains(num)){
                System.out.println(num);
            }
        }
    }
}

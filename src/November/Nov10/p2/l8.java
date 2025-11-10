package November.Nov10.p2;

import java.util.HashSet;

public class l8 {
    public static void main(String[] args) {
        int[]arr={1,3,5,6,7,2,4};
        int[] arr2={2,3,5,6,7,8,9};
        HashSet<Integer> hashset = new HashSet<>();
        for(int num1:arr){
            hashset.add(num1);
        }
        for(int num2:arr2){
            hashset.add(num2);
        }
        System.out.println(hashset);
    }
}

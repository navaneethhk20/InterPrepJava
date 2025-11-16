package November.Nov16.p1;

import java.util.HashSet;

public class l5 {
    public static void main(String[] args) {
        int[] arr={1,3,6,8,9};
        int[] arr1={2,4,6,8,9};

        HashSet<Integer> hashset= new HashSet<>();
        for(int num:arr){
            hashset.add(num);
        }

        for(int num: arr1){
           if(hashset.contains(num)){
               System.out.print(num+" ");
           }
        }

    }
}

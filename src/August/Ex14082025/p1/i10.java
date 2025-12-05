package August.Ex14082025.p1;

import java.util.HashSet;

public class i10 {
    public static void main(String[] args) {
        int[] arr={1,2,4,0,5,8};
        int [] arr2={1,3,6,7,9};
        HashSet<Integer> list= new HashSet<>();
        for(int num:arr){
            list.add(num);
        }
        for(int num:arr2){
            list.add(num);
        }
        System.out.println(list);
    }
}

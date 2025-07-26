package Ex252627072025.Part2_Arrays;

import java.util.HashSet;

public class Lab09 {
    public static void main(String[] args){
        //And two arrays into one and remove duplicate
        int [] arr1={1,2,3,4,6,7,9};
        int [] arr2={2,5,8,10,7,3,11};
        HashSet<Integer> aar = new HashSet<>();
        for(int num: arr1){
            aar.add(num);
        }
        for(int num:arr2){
            aar.add(num);
        }
        System.out.println(aar.toString());
    }
}

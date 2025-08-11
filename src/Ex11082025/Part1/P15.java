package Ex11082025.Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class P15 {
    public static void main(String[] args) {
        int[] arr={4,5,6,2,3,7,4,1,3};
        int[] arr2={4,6,6,8,7,9,6,4};

       HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for (int num:arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}

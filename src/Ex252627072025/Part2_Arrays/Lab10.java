package Ex252627072025.Part2_Arrays;

import java.util.Arrays;

public class Lab10 {
    public static void main(String[] args) {
        //swap two arrays of indexes
        int [] arr={1,3};
        int[] rev=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            rev[arr.length-1-i] =  arr[i];
        }
        System.out.println(Arrays.toString(rev));

    }
}

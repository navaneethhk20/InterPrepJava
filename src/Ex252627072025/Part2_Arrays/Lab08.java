package Ex252627072025.Part2_Arrays;

import java.util.Arrays;

public class Lab08 {
    public static void main(String[] args) {
        //swap the arrays keeping middle constant
        int[] arr ={1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < arr.length; i =i+ 3) {
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}

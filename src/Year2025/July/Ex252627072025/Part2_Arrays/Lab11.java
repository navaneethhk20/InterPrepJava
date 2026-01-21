package Year2025.July.Ex252627072025.Part2_Arrays;

import java.util.Arrays;

public class Lab11 {
    public static void main(String[] args) {
        //swap two array values
        int []arr1 ={1,2};
        int[] arr2={4,5};

        for(int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }

        System.out.println("arr1: " + Arrays.toString(arr1)); // [4, 5]
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}

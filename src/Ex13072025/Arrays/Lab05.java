package Ex13072025.Arrays;

import java.util.Arrays;

public class Lab05 {

    public static int[] product(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product = product*nums[j];
                }
            }
            result[i] = product;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};

        int[] result= product(input);
        System.out.println(Arrays.toString(result));

    }
}

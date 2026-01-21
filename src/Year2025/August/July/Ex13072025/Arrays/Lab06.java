package Year2025.August.July.Ex13072025.Arrays;

import java.util.Arrays;

public class Lab06 {
    public static int[] moveZerosToEndExtraArray(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] input = {1, 0, 2, 0, 3, 4, 0, 5, 0, 6, 0};
        int[] result = moveZerosToEndExtraArray(input);
        System.out.println(Arrays.toString(result));
    }
}

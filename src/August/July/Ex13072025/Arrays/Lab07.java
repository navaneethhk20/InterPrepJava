package August.July.Ex13072025.Arrays;

import java.util.Arrays;

public class Lab07 {
    public static void swapFirstThirdInPlace(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i += 3) {
            if (i + 2 < n) {

                int temp = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] input = {14, 27, 39, 42, 57, 61, 37, 98, 19};

        int[] result1 = input.clone();
        swapFirstThirdInPlace(result1);
        System.out.println(Arrays.toString(result1));

    }
}

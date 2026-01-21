package Year2025.December.Dec04.p2;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,23,9,8,77,66,55,43,21};
        for(int i=0;i<=arr.length-1;i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("second largest "+(arr[arr.length-2]));
        System.out.println("second smallest "+ arr[1]);
    }
}

package Year2025.July.Ex252627072025.Part2_Arrays;

import java.util.Arrays;

public class Lab05 {
    public static void main(String[] args) {
        //Second smallest & largest in an array
        int [] arr ={13,223,33,56,53,27,31,36,54,12,32,43,54,65,32};
        Arrays.sort(arr);
        System.out.println(arr[1]);
        System.out.println(arr[arr.length-2]);
    }
}

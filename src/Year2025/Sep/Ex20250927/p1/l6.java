package Year2025.Sep.Ex20250927.p1;

import java.util.Arrays;

public class l6 {
    public static void main(String[] args) {
        int[] arr={53,42,65,47,68,67,8799,34,86,765,653,5342,432,12,543,65,76,87};
        int index=0;
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

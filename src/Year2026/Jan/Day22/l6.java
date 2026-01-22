package Year2026.Jan.Day22;

import java.util.Arrays;

public class l6 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,67,8,9,90,8,7,6,5,4,3,1};

        for(int i=0;i<=arr.length-1;i=i+3){
            int temp= arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

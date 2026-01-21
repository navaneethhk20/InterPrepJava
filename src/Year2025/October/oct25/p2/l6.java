package Year2025.October.oct25.p2;

import java.util.Arrays;

public class l6 {
    public static void main(String[] args) {
        int[] arr={54,8,26,65,98,54,9,21,4};
        for(int i=0;i<=arr.length-1;i=i+3){

                int temp=arr[i];
                arr[i]=arr[i+2];
                arr[i+2]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}

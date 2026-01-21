package Year2025.August.EX28082025.p3;

import java.util.Arrays;

public class L6 {
    public static void main(String[] args) {
        int[] arr={4,5,2,9,4,8,1,6,7};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

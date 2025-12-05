package August.Ex20250809.p2;

import java.util.Arrays;

public class L1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9,5,6,4,5};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

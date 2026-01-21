package Year2025.November.Nov22.p1;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int[] arr={1,2,34,43,5,6,34,7,48,8,94,9,54,52,554,5436,7,8};

        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

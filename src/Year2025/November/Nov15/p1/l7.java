package Year2025.November.Nov15.p1;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,8,65,5,4,3,2};

        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

package Ex16092025.p1;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int[] arr={54,8,3,38,3,4,78,41,36};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp =arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

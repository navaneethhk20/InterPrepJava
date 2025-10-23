package October.Oct23.p1;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int[] arr={43,65,7,8,98,43,23,4,6,76,8,98};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

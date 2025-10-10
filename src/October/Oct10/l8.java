package October.Oct10;

import java.util.Arrays;

public class l8 {
    public static void main(String[] args){
        int[] arr={423,543,756,867,23,6,87,43,23};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

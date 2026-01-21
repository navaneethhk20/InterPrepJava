package Year2025.October.Oct13.p1;

import java.util.Arrays;

public class l6 {
    public static void main(String[] args) {
        int [] arr={23,54,67,87,5,3,98,62,2};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

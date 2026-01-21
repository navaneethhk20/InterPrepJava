package Year2025.October.Oct01.p1;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int [] arr={53,2,5,76,5,987,398,34,765,987,349,765,43,2,321};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

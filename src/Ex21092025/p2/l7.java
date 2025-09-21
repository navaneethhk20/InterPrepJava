package Ex21092025.p2;

import java.util.Arrays;
import java.util.Collections;

public class l7 {
    public static void main(String[] args) {
        int[] arr={2,534,4,54,5,765,6,876,7,439,8,70,9,80,1};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]<arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        System.out.println(arr[arr.length-2]);

    }
}

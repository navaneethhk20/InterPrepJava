package Year2025.August.Ex16082025.p2;

import java.util.Arrays;

public class l1 {
    public static void main(String[] args) {
        int[] arr={4,0,5,0,8,0,7,0,6,0,5};
        int index= arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[index--]=arr[i];
            }
        }
        while(index>=0){
            arr[index--]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

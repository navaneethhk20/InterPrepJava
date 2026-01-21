package Year2025.November.Nov15.p1;

import java.util.Arrays;

public class l9 {
    public static void main(String[] args) {
        int[] arr={1,0,3,0,4,0,5,0,6,0,7,0};
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
               arr[index++]=arr[i];
            }
        }
        while (index<=arr.length-1){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

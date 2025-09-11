package Ex11092025.p2;

import java.util.Arrays;

public class l2 {
    public static void main(String[] args) {
        int[] arr={3,0,2,0,7,0,1,4,0,6,0};
        int index=arr.length-1;
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

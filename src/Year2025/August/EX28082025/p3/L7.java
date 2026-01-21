package Year2025.August.EX28082025.p3;

import java.util.Arrays;

public class L7 {
    public static void main(String[] args) {
        int[] arr={4,0,5,0,2,9,0,4,8,0,1,0};
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<= arr.length-1){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

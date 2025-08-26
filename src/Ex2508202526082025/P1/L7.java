package Ex2508202526082025.P1;

import java.util.Arrays;

public class L7 {
    public static void main(String[] args) {
        int[]arr={3,6,8,0,60,43,0,8,0};
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

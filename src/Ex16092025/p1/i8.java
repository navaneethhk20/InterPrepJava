package Ex16092025.p1;

import java.util.Arrays;

public class i8 {
    public static void main(String[] args) {
        int[] arr={2,0,7,0,5,0,6,0,1,0,3};
        int index=0;
        for(int i=0;i<= arr.length-1;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }

        while(index<=arr.length-1){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

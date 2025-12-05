package August.Ex2508202526082025.P1;

import java.util.Arrays;

public class L8 {
    public static void main(String[] args) {
        int [] arr={5,0,6,0,4,0,7,0};
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

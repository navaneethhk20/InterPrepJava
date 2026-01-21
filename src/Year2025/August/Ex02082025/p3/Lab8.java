package Year2025.August.Ex02082025.p3;

import java.util.Arrays;

public class Lab8 {
    public static void main(String[] args) {
        //push the zeros to end
        int[] arr ={1,2,0,4,0,5,0,8,3};
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

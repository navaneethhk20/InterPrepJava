package Ex02082025.p3;

import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {
        //keep middle as common and interchange 1st and 3rd
        int[] arr={4,5,8,7,6,3,2,4,8,7,6,7,2,3,4};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp =arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

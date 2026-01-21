package Year2025.Sep.Ex08092025.p2;

import java.util.Arrays;

public class l2 {
    public static void main(String[] args) {
        int[]  arr={43,56,65,7,5,32,21,3,5,46,77,8};

        for(int i=0;i<=arr.length-1;i=i+3){
            int temp =arr[i];
            arr[i] = arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

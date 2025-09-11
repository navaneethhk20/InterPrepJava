package Ex11092025.p1;

import Ex04072025.Abstraction.Son;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int[] arr={43,56,67,98,309,432,32,21,3,356,78,9765,65,43,2};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp =arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

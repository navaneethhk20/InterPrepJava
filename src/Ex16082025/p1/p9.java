package Ex16082025.p1;

import java.util.Arrays;

public class p9 {
    public static void main(String[] args) {
        int [] arr={54,89,78,32,6,47,9,6,74};
        for(int i=0;i<= arr.length-1;i=i+3){
                int temp =arr[i];
                arr[i]=arr[i+2];
                arr[i+2]=temp;
            }

        System.out.println(Arrays.toString(arr));
    }
}

package Ex11082025.Part1;

import java.util.Arrays;

public class P5 {
    public static void main(String[] args) {
        int[] arr={4,65,675,32,43,56,78,6897,9,65,3265,87,76,94,736};
        for(int i=0;i< arr.length-1;i=i+3){
           int temp=arr[i];
           arr[i]=arr[i+2];
           arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

package Ex21082025.p1;

import java.util.Arrays;

public class L7 {
    public static void main(String[] args) {
        int[] arr={32,54,76,87,897,665,5,4,332,654,4345,64,3,65,78,98};
        for(int i=0; i<arr.length-1;i=i+3){
            int temp = arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

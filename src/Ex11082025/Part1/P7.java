package Ex11082025.Part1;

import java.util.Arrays;

public class P7 {
    public static void main(String[] args) {
        int[] arr={1,0,2,0,4,0,5,0,3,0,8,0};
        int index=0;

        for(int i=0;i<= arr.length-1;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while (index< arr.length-1){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

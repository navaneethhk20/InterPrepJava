package Year2025.August.Ex21082025.p1;

import java.util.Arrays;

public class L9 {
    public static void main(String[] args) {
        int [] arr={4,0,0,2,0,3,9,0,7,8,0};
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while (index<=arr.length-1){
           arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

package October.Oct10;

import java.util.Arrays;

public class l10 {
    public static void main(String[] args) {
        int [] arr={2,0,3,0,6,0,2,0,5,0,4,0};
        int index= arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[index--]=arr[i];
            }
        }
        while (index>=0){
            arr[index--]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

package November.Nov03.p1.p2;

import java.util.Arrays;

public class l10 {
    public static void main(String[] args) {
        int[] arr={4,0,6,0,7,0,1,0,3,0,2,0};
        int index=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[index--]=arr[i];
            }
        }
        while(index>=0){
            arr[index--]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

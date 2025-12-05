package September.Ex11092025.p2;

import java.util.Arrays;

public class l1 {
    public static void main(String[] args) {
        int [] arr={3,5,0,9,0,5,0,2,0,2,0};
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<=arr.length-1){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }

}

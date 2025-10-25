package October.oct25.p2;

import java.util.Arrays;

public class l9 {
    public static void main(String[] args) {
        int[] arr={2,30,5,20,6,10,7,50,8,70,1};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        System.out.println(arr[arr.length-2]);
    }
}

package November.Nov10.p2;

import java.util.Arrays;

public class l6 {
    public static void main(String[] args) {
        int[] arr={14,30,59,77,58,49,25,13,12,15};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
    }
}

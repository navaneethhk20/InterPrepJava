package November.Nov15.p2;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int[] arr={8,9,5,3,1,6,90,78,56,34,12};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
        System.out.println(arr[1]);
    }
}

package Year2026.Jan.Day22;

import java.util.Arrays;

public class L16 {
    public static void main(String[] args) {
        int[] arr={1,24,54,75,78,96,74,253,23,12,32,66,56,27,38,59,998,97,57,426,54,34,43};

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
        System.out.println(arr[1]);
        System.out.println(arr[arr.length-2]);
    }
}

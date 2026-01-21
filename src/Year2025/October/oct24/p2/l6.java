package Year2025.October.oct24.p2;

import java.util.Arrays;

public class l6 {
    public static void main(String[] args) {
        int [] arr={3,54,59,67,8,56,43,23,2,32,45,54,6,76,87,89,894};

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]<arr[j]){
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

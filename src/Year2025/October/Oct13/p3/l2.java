package Year2025.October.Oct13.p3;

import java.util.Arrays;

public class l2 {
    public static void main(String[] args) {
        int [] arr={23,54,6,8,90,4,23,594,56,78,98,3,254,65,87,54};
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

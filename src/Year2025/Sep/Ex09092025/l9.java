package Year2025.Sep.Ex09092025;

import java.util.Arrays;

public class l9 {
    public static void main(String[] args) {
        int[] arr={54,65,756,876,98,234,23,545,645765,87,876,87,987,78};
        for(int i=0;i<=arr.length-1;i++) {
            for(int j=0;j<arr.length-1;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("second largest is "+arr[arr.length-2]);
        System.out.println("second smallest is "+arr[1]);
    }
}

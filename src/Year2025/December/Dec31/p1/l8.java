package Year2025.December.Dec31.p1;

import java.util.Arrays;

public class l8 {
    public static void main(String[] args) {
        int[] arr={4,8,7,4,6,252,13,11,22,5,9,8,7,44,8,855,77,44,22,66,3,22,1};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++) {

                if (arr[i]>arr[j]){
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

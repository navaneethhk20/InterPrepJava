package Ex16092025.p2;

import java.util.Arrays;

public class l6 {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,0,9,1,3};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("second smallest is "+arr[1]);
        System.out.println("second largest is "+arr[arr.length-2]);
    }
}

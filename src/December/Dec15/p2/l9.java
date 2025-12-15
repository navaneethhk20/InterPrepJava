package December.Dec15.p2;

import java.util.Arrays;

public class l9 {
    public static void main(String[] args) {
        int[] arr={11,24,54,35,17,28,29,92,38,364,67,47,93,94,75,674,82,19,92};

        for(int i=0;i<=arr.length-1;i++) {
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
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

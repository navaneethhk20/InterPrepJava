package Ex21082025.p2;

import java.util.Arrays;

public class L1 {
    public static void main(String[] args) {
        int [] arr={41,8,2,44,11,55,88,4,66,8,754,54,48,5,21,52};

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
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

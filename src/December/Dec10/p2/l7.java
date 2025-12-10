package December.Dec10.p2;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int[] arr={12,31,25,63,84,56,64,83,22,22,32,436,49,58,66,5732,81,29,263,33,5};

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
        System.out.println("Second largest is "+ arr[arr.length-2]);
        System.out.println("second smallest is "+ arr[1]);
    }
}

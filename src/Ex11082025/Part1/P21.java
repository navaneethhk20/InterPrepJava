package Ex11082025.Part1;

import java.util.Arrays;

public class P21 {
    public static void main(String[] args) {
        int[] arr={4,5,3,6,2,8,52,41,7,9,23,1,47,8,6,2,1,78,52,1,4,8,32,1,4,789,52};

        int n=arr.length-1;

        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

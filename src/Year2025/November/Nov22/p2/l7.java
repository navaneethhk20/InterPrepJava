package Year2025.November.Nov22.p2;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int [] arr={1,22,43,25,16,57,78,69};

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++) {
                if (arr[i] > arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
    }
}

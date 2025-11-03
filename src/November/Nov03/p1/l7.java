package November.Nov03.p1;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int[] arr={43,65,7,89,54,23,45,78,89,90,98,75,43,5,35,554,3,32,4,625,67};
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

package September.Ex20250927.p2;

import java.util.Arrays;

public class l6 {
    public static void main(String[] args) {
        int [] arr={23,543,5,656,565,7,76,76,67,868,787,6,765,654,5432,213,423,54,6567,7898,54,76,543,432};
        for(int i=0;i<= arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]<arr[j]){
                    int temp =arr[i];
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

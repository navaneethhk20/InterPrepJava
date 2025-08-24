package Ex24082025.p2;

import java.util.Arrays;

public class L6 {
    public static void main(String[] args) {
        int [] arr={53,543,654,76,54,342,144,586,543,241,387,463,595,443,442,445,642,745,244,346,432,432};


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
        System.out.println("second largest is "+arr[arr.length-2]);
        System.out.println("second smallest is "+arr[1]);
    }
}

package Ex16082025.p2;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int[] arr={635,21,32,625,8,54,352,342,615,56,52,5448,98,65,323,241,54,81,65,32,281,75,86,978,4754};

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
        System.out.println("second smallest is "+ arr[1]);
        System.out.println("second largest is "+arr[arr.length-1]);
    }
}

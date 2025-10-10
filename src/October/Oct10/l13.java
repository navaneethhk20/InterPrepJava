package October.Oct10;

import java.util.Arrays;

public class l13 {
    public static void main(String[] args) {
        int[]arr={32,56,87,28,65,97,64,54,132,4123,765,6,909,78};
        for(int i=0;i<=arr.length-1;i++){
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

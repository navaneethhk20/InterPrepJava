package Year2025.October.Oct01.p2;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int [] arr={23,4,5,67,87,8,87,6,655,44,3321,345,1243,987,6576,87,678,9,98,95,345};
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

package Ex18082025.p2;

import java.util.Arrays;

public class l4 {
    public static void main(String[] args) {
        int [] arr={4,6,78,7,9,69,41,1,21,3,51,47,724,85,69,31,43,74,8,22};
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
        System.out.println("second smallet is "+arr[1]);
    }
}

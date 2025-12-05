package August.Ex14082025.p1;

import java.util.Arrays;

public class l11 {
    public static void main(String[] args) {
        int [] arr={1,2,4,5,7,8,8,55,22,33,22,11,44,66,22,44,12,23,21,45,65,78,98,75,88,66};
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
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[1]);
    }
}

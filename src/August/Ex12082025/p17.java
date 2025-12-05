package August.Ex12082025;

import java.util.Arrays;

public class p17 {
    public static void main(String[] args) {
        int [] arr={23,27,28,29,26,22,44,25};


        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<= arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
        System.out.println(arr[1]);

    }
}

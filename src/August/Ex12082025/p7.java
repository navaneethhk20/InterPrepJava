package August.Ex12082025;

import java.util.Arrays;

public class p7 {
    public static void main(String[] args) {
        int [] arr={54,65,23,15,54,87,98,65,52,21,54,8,8,56,45};

        for(int i=0;i<=arr.length-1;i=i+3){
            int temp =arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

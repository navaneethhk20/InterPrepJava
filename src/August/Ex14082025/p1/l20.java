package August.Ex14082025.p1;

import java.util.Arrays;

public class l20 {
    public static void main(String[] args) {
        int[] arr={45,65,87,65,98,45,32,12,54};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp =arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}

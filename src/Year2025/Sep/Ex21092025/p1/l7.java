package Year2025.Sep.Ex21092025.p1;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int [] arr={53,42,654,756,865,978,54,234,231,1,453,254,65,467,568,76,7,8};
        for(int i=0;i<=arr.length-1;i=i+3){
         int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
         }
        System.out.println(Arrays.toString(arr));
    }
}

package August.Ex18082025.p1;

import java.util.Arrays;

public class l7 {
    public static void main(String[] args) {
        int [] arr={34,32,89,21,54,65,6767,7,87,98,9,19,89,7,6,54,45,45};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

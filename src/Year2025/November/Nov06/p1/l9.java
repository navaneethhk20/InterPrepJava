package Year2025.November.Nov06.p1;

import java.util.Arrays;

public class l9 {
    public static void main(String[] args) {
        int[] arr={23,45,665,767,89,634,23,345,546,432,3456,657,86,54,90};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}

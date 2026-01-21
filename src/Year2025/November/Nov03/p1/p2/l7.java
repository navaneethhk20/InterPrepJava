package Year2025.November.Nov03.p1.p2;

import java.util.Arrays;
public class l7 {
    public static void main(String[] args) {
        int[] arr={43,65,78,98,6,54,3,2,32,45,56,67,78,7,90};
        for(int i=0;i<=arr.length-1;i=i+3){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

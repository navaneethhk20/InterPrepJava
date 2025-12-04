package December.Dec04.p1;

import java.util.Arrays;

public class L10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] result= new int[arr.length];
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2!=0){
               result[index++]=arr[i];
            }
        }
        for(int j=0;j<=arr.length-1;j++){
            if(arr[j]%2==0){
                result[index++]=arr[j];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}

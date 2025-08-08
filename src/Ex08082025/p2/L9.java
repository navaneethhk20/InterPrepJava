package Ex08082025.p2;

import java.util.Arrays;

public class L9 {
    public static void main(String[] args) {
        //push 0's to end
        int[] arr={1,2,3,0,4,0,5,0};
        int index=0;

        for(int i=0;i<= arr.length-1;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }

        while (index< arr.length-1){
           arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

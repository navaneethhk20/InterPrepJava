package July.Ex252627072025.Part2_Arrays;

import java.util.Arrays;

public class Lab06 {
    public static void main(String[] args) {
        //move the zeros to end
        int[] arr={1,0,2,0,3,4,5,0};
        int index=0;
        for(int i=0;i< arr.length;i++){
         if(arr[i]!=0){
             arr[index++]= arr[i];
         }
        }
     while (index< arr.length){
         arr[index++]=0;
     }
        System.out.println(Arrays.toString(arr));
    }
}

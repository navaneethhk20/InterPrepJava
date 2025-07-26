package Ex252627072025.Part2_Arrays;

import java.util.Arrays;

public class Lab07 {
    public static void main(String[] args) {
        //move the zero to begining
      int [] arr={1,0,2,3,0,5,6,0,0};
      int index = arr.length-1;
      for(int i= arr.length-1;i>=0;i--){
          if(arr[i]!=0){
              arr[index--]=arr[i];
          }
        }
      while(index>= 0){
          arr[index--] =0;
      }
        System.out.println(Arrays.toString(arr));
    }
}

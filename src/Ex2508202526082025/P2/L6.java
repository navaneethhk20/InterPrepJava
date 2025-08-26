package Ex2508202526082025.P2;

import java.util.Arrays;

public class L6 {
    public static void main(String[] args) {
        int[] arr={543,654,65,76,768,6756,45,3422,3144,35,465,76,565,4,65,32,766,8987,76};

      for(int i=0;i<=arr.length-1;i++){
          for(int j=i+1;j<=arr.length-1;j++){
             if( arr[i]>arr[j]){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
             }
          }
      }
        System.out.println(Arrays.toString(arr));
        System.out.println("second largest is "+arr[arr.length-2]);
        System.out.println("second smallest is "+arr[1]);
    }
}

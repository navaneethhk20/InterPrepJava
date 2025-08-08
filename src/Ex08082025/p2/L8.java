package Ex08082025.p2;

import java.util.Arrays;

public class L8 {
    public static void main(String[] args) {
        //keep middle and reverse the 1& 3
        int [] arr={111,222,333,444,555,666,777,888,9990};
        for(int i=0;i<arr.length-1;i=i+3){
            int temp =arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

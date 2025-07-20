package Ex19072025And20072025.Arrays;

import java.util.Arrays;

public class Lab08 {
    public static void main(String[] args) {
        //Push the O's to  beging of array
        int [] arr ={1,2,0,3,4,0,6,0};

        int index = arr.length - 1;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] != 0) {
                arr[index--] = arr[i];
            }
        }
        while(index >= 0) {
            arr[index--] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}

package August.July.Ex19072025And20072025.Arrays;

import java.util.Arrays;

public class Lab07 {
    public static void main(String[] args) {
        //Push the O's to end of array
        int [] arr ={1,2,0,3,4,0,6,0};

        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while(index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));

    }
}

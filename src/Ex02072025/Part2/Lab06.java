package Ex02072025.Part2;

import java.util.Arrays;

public class Lab06 {
    public static void main(String[] args) {
        //second largest in an array
        int [] arr1 ={4,6,56,66,89,52,66,54,55,45,88,66,5};
        Arrays.sort(arr1);
        System.out.println(arr1[arr1.length-2]);
    }
}

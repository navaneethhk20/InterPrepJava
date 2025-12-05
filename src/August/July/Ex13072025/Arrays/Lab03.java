package August.July.Ex13072025.Arrays;

import java.util.Arrays;

public class Lab03 {
    public static void main(String[] args) {
        //Find second and third smallest
        int [] age = {41,6,2,43,26,8,9,8,6,5,88,24,85,3,5};
        Arrays.sort(age);
        System.out.println(age.length);
        System.out.println(age[age.length-14]);
        System.out.println(age[age.length-13]);
    }
}

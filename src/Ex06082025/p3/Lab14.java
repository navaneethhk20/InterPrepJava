package Ex06082025.p3;

import java.util.Arrays;
import java.util.Collections;

public class Lab14 {
    public static boolean isAnagram(String str1, String str2){
        str1= str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length()){
            return false;
        }

        char[]  arr1 = str1.toCharArray();
        char[] arr2= str2.toCharArray();

        Arrays.sort(arr2);
        Arrays.sort(arr1);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        String s1="silent";
        String s2="misten";
        System.out.println(isAnagram(s1,s2));
    }
}

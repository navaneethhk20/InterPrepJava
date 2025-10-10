package October.Oct10;

import java.util.Arrays;

public class l5 {

    public static Boolean isAnagram(String str1, String str2){
        str1= str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length()){
            return false;
        }
        char [] arr1= str1.toCharArray();
        char [] arr2= str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        String s1="solent";
        String s2="Listen";
        System.out.println(isAnagram(s1,s2));
    }
}

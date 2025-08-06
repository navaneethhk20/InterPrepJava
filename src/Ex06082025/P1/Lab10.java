package Ex06082025.P1;

import java.util.Arrays;

public class Lab10 {

    public static boolean isAnagram(String str1, String str2){
       str1= str1.toLowerCase();
        str2= str2.toLowerCase();

        if(str1.length()!=str2.length()){
            return  false;
        }

        char[] arr1 =str1.toCharArray();
        char[] arr2= str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);

    }

    public static void main(String[] args) {
        //Anagram
        String s1= "listen";
        String s2="islent";
        System.out.println(isAnagram(s1,s2));
    }
}

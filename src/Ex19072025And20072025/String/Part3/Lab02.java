package Ex19072025And20072025.String.Part3;

import  java.util.Arrays;

public class Lab02 {
    public static boolean anagram(String st1, String str2) {
        //Anagram of string
        st1 = st1.replaceAll("\\s+","").toLowerCase();
        str2 = str2.replaceAll("\\s+","").toLowerCase();

        if(st1.length() == str2.length()){
            return true;
        }
        char[] arr1 = st1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args){
        System.out.println( anagram("listen","silent"));

    }
}

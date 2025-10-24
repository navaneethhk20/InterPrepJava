package October.oct24.p1;

import java.util.Arrays;

public class l7 {
    public static Boolean isAnagram(String str, String str2){
        str= str.toLowerCase();
        str2=str2.toLowerCase();

        if(str.length()!=str2.length()){
            return false;
        }

        char[] arr1= str.toCharArray();
        char[] arr2= str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        String s1="Kisten";
        String s2= "Silent";
        System.out.println(isAnagram(s1,s2));
    }
}

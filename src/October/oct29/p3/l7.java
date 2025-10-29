package October.oct29.p3;

import java.util.Arrays;

public class l7 {

    public static Boolean isAnagram(String s1, String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }

        char [] arr1= s1.toCharArray();
        char [] arr2= s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        String input="Silent";
        String input1="Listen";
        System.out.println(isAnagram(input1, input));
    }
}

package August.Ex12082025;

import java.util.Arrays;

public class P25 {
    public static boolean isAnagram(String st1, String st2){
        st1= st1.toLowerCase();

        st2= st2.toLowerCase();

        if(st1.length()!=st2.length()){
            return false;
        }


        char[] arr= st1.toCharArray();
        char[] arr2= st2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        return Arrays.equals(arr,arr2);
    }


    public static void main(String[] args) {
        String s1="Tilent";
        String s2="Listen";
        System.out.println(isAnagram(s1,s2));
    }
}

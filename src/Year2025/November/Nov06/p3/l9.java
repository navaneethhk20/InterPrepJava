package Year2025.November.Nov06.p3;

import java.util.Arrays;

public class l9 {
    public static void main(String[] args) {
        String s1= "silent";
        String s2="kisten";
        System.out.println(isAnagram(s1,s2));
    }
    public static Boolean isAnagram(String str, String str2){
        str=str.toLowerCase();
        str2=str2.toLowerCase();

        if(str.length()!=str2.length()){
            return false;
        }

        char[] arr= str.toCharArray();
        char [] arr2= str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        return Arrays.equals(arr,arr2);
    }
}

package Ex21082025.p2;

import java.util.Arrays;

public class L9 {
    public  static boolean isAnagram(String s1, String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!= s2.length()){
            return false;
        }
        char [] arr1=s1.toCharArray();
        char [] arr2= s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        String str1="arc";
        String str2= "Car";
        System.out.println(isAnagram(str1,str2));
    }
}

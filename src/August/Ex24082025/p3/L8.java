package August.Ex24082025.p3;

import java.util.Arrays;

public class L8 {
    public static boolean isAnagram(String st1, String st2){
        st1= st1.toLowerCase();
        st2=st2.toLowerCase();
        if(st1.length()!=st2.length()){
            return false;
        }

        char[] arr1= st1.toCharArray();
        char [] arr2= st2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);

    }



    public static void main(String[] args) {
        String s1="aas";
         String s2= "Car";
         System.out.println(isAnagram(s1,s2));
    }
}

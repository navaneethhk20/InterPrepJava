package Ex252627072025.Part1_String;

import java.util.Arrays;

public class Lab16 {

    public static boolean checkAnagram(String st, String st2){
        st =st.toLowerCase();
        st2= st2.toLowerCase();

        if(st.length() != st2.length()){
            return false;
        }

        char [] arr1 =st.toCharArray();
        char [] arr2 =st2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
       return Arrays.equals(arr1,arr2);


    }
    public static void main(String[] args) {
        String str1 ="silent";
        String str2 ="iisten";
        System.out.println(checkAnagram(str1,str2));

    }
}

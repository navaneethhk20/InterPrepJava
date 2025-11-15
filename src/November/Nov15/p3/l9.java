package November.Nov15.p3;

import java.util.Arrays;

public class l9 {
    public static void main(String[] args) {
        String in="silent";
        String in2="Listen";
        System.out.println(isAnagram(in,in2));
    }
    public static Boolean isAnagram(String inp1, String inp2){
        inp1=inp1.toLowerCase();
        inp2=inp2.toLowerCase();

        if(inp2.length()!=inp1.length()){
            return false;
        }

        char[] arr1= inp1.toCharArray();
        char [] arr2= inp2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}

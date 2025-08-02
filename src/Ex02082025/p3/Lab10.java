package Ex02082025.p3;

import java.util.HashMap;
import java.util.HashSet;

public class Lab10 {
    public static void main(String[] args) {
        String[] arr1={"mango","orange","apple"};
        String[] arr2={"banana","guava", "mango"};

        HashMap<String,Integer> hashSet = new HashMap<>();
        for(String common:arr1){
            hashSet.put(common,1);
        }
        for (String common:arr2){
            if(hashSet.containsKey(common)){
                System.out.println(common);
            }
        }
    }
}

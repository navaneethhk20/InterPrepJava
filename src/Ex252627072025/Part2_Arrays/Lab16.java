package Ex252627072025.Part2_Arrays;

import java.util.HashMap;

public class Lab16 {
    public static void main(String[] args) {
        //Print common elements in two arrays
        String []arr1={"apple","mango","strawberry"};
        String [] arr2={"mango","coffee","banana"};
        HashMap<String,Integer>hashMap = new HashMap<>();
        for(String common: arr1){
            hashMap.put(common,1);
        }
        for (String common: arr2){
           if( hashMap.containsKey(common)){
               System.out.println(common);
            }
        }

    }
}

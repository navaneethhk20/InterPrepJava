package Year2025.August.Ex24082025.p3;

import java.util.HashMap;

public class L1 {
    public static void main(String[] args) {
        String[] arr1={"nithu", "hk", "dhk","pol"};
        String [] arr2={"fsd","Gsds","pol","RWe","hk"};

        HashMap<String, Integer> hashmap = new HashMap<>();
        for(String common: arr1){
            hashmap.put(common,1);
        }

        for(String common: arr2){
            if(hashmap.containsKey(common)){
                System.out.println(common);
            }
        }
    }
}

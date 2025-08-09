package Ex20250809.p2;

import java.util.HashMap;
import java.util.Map;

public class L5 {
    public static void main(String[] args) {
        String[] arr={"nithu","hk","hosuru","magge"};
        String [] arr2={"white", "magge","hassan","hosuru"};
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String common:arr){
            hashMap.put(common,1);
        }

        for(String common:arr2){
            if(hashMap.containsKey(common)){
                System.out.println(common);

            }
        }
    }
}

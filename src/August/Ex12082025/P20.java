package August.Ex12082025;

import java.util.HashMap;

public class P20 {
    public static void main(String[] args) {
        String [] arr1={"hk","kl","po","ui"};
        String[] arr2={"sd","tr","iu","kl"};

        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String common:arr1){
            hashMap.put(common,1);
        }
        for(String common: arr2){
            if(hashMap.containsKey(common)){
                System.out.println(common);
            }
        }

    }
}

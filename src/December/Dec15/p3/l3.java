package December.Dec15.p3;

import java.util.HashMap;

public class l3 {
    public static void main(String[] args) {
        String[] arr1 = {"fsda", "gret", "sxqw", "oui"};
        String[] arr2 = {"fsd", "hu", "nty", "oui"};

        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String common: arr1){
            hashMap.put(common,1);
        }

        for(String common:arr2){
            if(hashMap.containsKey(common)){
                System.out.println(common);
            }
        }
    }

}

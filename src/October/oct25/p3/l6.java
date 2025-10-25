package October.oct25.p3;

import java.util.HashMap;

public class l6 {
    public static void main(String[] args) {
        String[] arr={"gfgdf","Ter","Gerg","GErg","Ger"};
        String[] arr2={"gdfsg","Ger","ge","Grt","Gerg"};

        HashMap<String, Integer> hashmap = new HashMap<>();
        for(String common: arr){
            hashmap.put(common,1);
        }
        for(String common:arr2){
            if(hashmap.containsKey(common)){
                System.out.println(common);
            }
        }
    }
}

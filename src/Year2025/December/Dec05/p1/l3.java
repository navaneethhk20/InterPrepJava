package Year2025.December.Dec05.p1;

import java.util.HashMap;
import java.util.Map;

public class l3 {
    public static void main(String[] args) {
        String[] arr={"where","to","three","start","dog","cat","me"};

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String common: arr){
            hashMap.put(common,common.length());
        }

        for(Map.Entry<String,Integer>entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" is "+entry.getValue());
        }

    }
}

package December.Dec16.p3;

import java.util.HashMap;
import java.util.Map;

public class l5 {
    public static void main(String[] args) {
        String[] arr={"when","at","cat","dog","at","cat"};

        HashMap<String,Integer> hashmap = new HashMap<>();
        for(String smm: arr){
            hashmap.put(smm, hashmap.getOrDefault(smm,0)+1);
        }

        for(Map.Entry<String,Integer> entry: hashmap.entrySet()){
            System.out.println(entry.getKey()+" occurs "+ entry.getValue());
            
        }
    }
}

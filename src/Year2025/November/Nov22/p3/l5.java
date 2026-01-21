package Year2025.November.Nov22.p3;

import java.util.HashMap;


public class l5 {
    public static void main(String[] args) {
        String[] input={"Fesd","twq","bty","vsxvwq","fqwf"};
        String[] in2={"fwd","fwqe","fqw4","twq","qwqw"};

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String coomon: input){
            hashMap.put(coomon, hashMap.getOrDefault(coomon,0)+1);
        }
        for(String coomon: in2){
            hashMap.put(coomon, hashMap.getOrDefault(coomon,0)+1);
        }
       for (String cm: hashMap.keySet()){
           if(hashMap.get(cm)==1){
               System.out.println(cm);
           }
       }
    }
}

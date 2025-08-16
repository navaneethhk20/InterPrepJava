package Ex16082025.p2;

import java.util.HashMap;


public class L11 {
    public static void main(String[] args) {
        String[] input={"in","out","gpo"};
        String[] input2={"re", "nhk", "out"};

        HashMap<String, Integer> hashMap= new HashMap<>();
        for(String common: input){
            hashMap.put(common, hashMap.getOrDefault(common,0)+1);
        }
        for(String common: input2){
            if(hashMap.containsKey(common)){
                System.out.println(common);
            }
        }
    }
}

package Year2025.November.Nov15.p3;

import java.util.HashMap;

public class l1 {
    public static void main(String[] args) {
        String[] input={"vf","Grew","ge","wewe","bfg"};
        String [] inpt={"freqw","hyt","dawe","bfg","rwe"};

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String common: input){
            hashMap.put(common,1);
        }

        for(String common: inpt){
           if(hashMap.containsKey(common)){
               System.out.println(common);
           }
        }

    }
}

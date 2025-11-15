package November.Nov15.p3;

import javax.xml.transform.sax.SAXResult;
import java.util.HashMap;

public class l2 {
    public static void main(String[] args) {
        String[] input={"vf","Grew","ge","wewe","bfg"};
        String [] inpt={"freqw","hyt","dawe","bfg","rwe"};

        HashMap<String,Boolean> hashMap = new HashMap<>();
        for(String common: input){
            hashMap.put(common,true);
        }

        for(String common: inpt){
            hashMap.put(common,true);
        }

        for(String str: hashMap.keySet()){
            System.out.print(str+" ");
        }
    }
}

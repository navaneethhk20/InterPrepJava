package October.Oct01.p2;

import java.util.HashMap;
import java.util.SimpleTimeZone;

public class l10 {
    public static void main(String[] args) {
        String[] s1={"fwd","Rfd","Fwedgf","gsdg"};
        String [] s2={"gdfs","Rfd","gdfg","gewrg"};
        HashMap<String,Integer> hashMap= new HashMap<>();
        for(String common: s1){
            hashMap.put(common,1);
        }

        for(String common: s2){
            if(hashMap.containsKey(common)){
                System.out.println(common);
            }
        }
    }
}

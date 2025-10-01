package October.Oct01.p3;

import java.util.ArrayList;
import java.util.HashMap;

public class l1 {
    public static void main(String[] args) {
        String[] s1={"fwd","Rfd","Fwedgf","gsdg"};
        String [] s2={"gdfs","Rfd","gdfg","gewrg"};

        HashMap<String,Boolean> hashMap = new HashMap<>();
        for(String common:s1){
            hashMap.put(common,true);
        }
        for(String common:s2){
            hashMap.put(common,true);
        }

//        for(String str: hashMap.keySet()){
//            System.out.print(str+" ");
//        }
        ArrayList<String> result = new ArrayList<>(hashMap.keySet());
        System.out.println(result);
    }
}

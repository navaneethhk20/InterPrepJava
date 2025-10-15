package October.Oct13.p3;

import java.util.HashMap;

public class l10 {
    public static void main(String[] args) {
        String []s1={"gdf","ytre","jok","vcx"};
        String[] s2 ={"ghyt","pmko","few","gdf"};

        HashMap<String,Boolean> hashMap = new HashMap<>();
        for(String add: s1){
            hashMap.put(add,true);
        }
        for(String add2: s2){
            hashMap.put(add2,true);
        }

        for(String str: hashMap.keySet()){
            System.out.print(str+" ");
        }





    }
}

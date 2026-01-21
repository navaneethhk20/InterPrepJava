package Year2025.October.Oct13.p3;

import java.util.HashMap;

public class l9 {
    public static void main(String[] args) {
         String []s1={"gdf","ytre","jok","vcx"};
         String[] s2 ={"ghyt","pmko","few","gdf"};

        HashMap<String,Integer> hashMap = new HashMap<>();
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

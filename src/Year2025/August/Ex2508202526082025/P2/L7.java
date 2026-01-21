package Year2025.August.Ex2508202526082025.P2;

import java.util.HashMap;

public class L7 {
    public static void main(String[] args) {
        String [] s1={"gdf","Gdfs","Hgf","gdf"};
        String[] s2= {"DFg","gdsfg","gdf"};
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

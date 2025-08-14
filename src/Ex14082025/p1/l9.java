package Ex14082025.p1;

import java.util.HashMap;

public class l9 {
    public static void main(String[] args) {
        String [] arr={"gd","gfd","gfdg","Gdf"};
        String[] arr2={"gfd","Gdfsg","Gdf","gdsf"};


        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String common: arr){
            hashMap.put(common,1);
        }
        for(String common:arr2){
            if(hashMap.containsKey(common)){
                System.out.println(common);
            }
        }
    }
}

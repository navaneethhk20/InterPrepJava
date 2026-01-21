package Year2025.August.Ex18082025.p2;

import java.util.HashMap;

public class l7 {
    public static void main(String[] args) {
        String[] input={"gfd","Gdf","GDf","tre","tre"};
        String[] input2={"GDf","Ggf","Gdsfg","TER","TEr"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String ch: input){
            hashMap.put(ch,1);
        }
        for(String ch: input2){
            if(hashMap.containsKey(ch)){
                System.out.println(ch);
            }
        }

    }
}

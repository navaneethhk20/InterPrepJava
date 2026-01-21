package Year2025.Sep.Ex20250927.p2;

import java.util.HashMap;

public class l9 {
    public static void main(String[] args) {
        String[] s1={"rew","Rwet","Twe"};
        String[] s2={"rwe","rjew","Twer"};

        HashMap<String,Boolean> hashMap = new HashMap<>();
        for(String common: s1){
            hashMap.put(common,true);
        }
        for(String common: s2){
            hashMap.put(common,true);
        }

        for(String str: hashMap.keySet()){
            System.out.print(str+" ");
        }
    }
}

package Ex25092025.p1;

import java.util.HashMap;

public class l10 {
    public static void main(String[] args) {
        String [] s1={"Ter","Terw","ytr","hjtr"};
        String[] s2={"sdgt","Gddfs","gdsfg","Gdsf","ytr"};

//        HashMap<String,Integer> hashMap = new HashMap<>();
//        for(String common: s1){
//            hashMap.put(common,1);
//        }
//        for(String common: s2){
//            if(hashMap.containsKey(common)){
//                System.out.println(common);
//            }
//        }
        HashMap<String, Boolean> hashMap = new HashMap<>();
        for(String common: s1){
            hashMap.put(common,true);
        }
        for(String common: s2){
            hashMap.put(common,true);
        }
        for(String str: hashMap.keySet()) {
            System.out.print(str+" ");
        }
    }
}

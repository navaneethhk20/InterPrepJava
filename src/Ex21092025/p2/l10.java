package Ex21092025.p2;

import java.util.HashMap;

public class l10 {
    public static void main(String[] args) {
        String[] s1 = {"Fs", "eyrgf", "Gsdftr", "Tert"};
        String[] s2 = {"fsd", "Gewr", "rwqe", "GDSfg"};

        HashMap<String, Boolean> hashMap = new HashMap<>();
        for (String str : s1) {
            hashMap.put(str, true);
        }

        for (String str : s2) {
            hashMap.put(str, true);
        }
        for (String str : hashMap.keySet()) {
            System.out.println(str);
        }
    }
//        for(String common: s1){
//            hashMap.put(common, hashMap.getOrDefault(common,0)+1);
//        }
//
//        for(String common: s2){
//            hashMap.put(common, hashMap.getOrDefault(common,0)+1);
//        }
//        System.out.println(hashMap);
    }


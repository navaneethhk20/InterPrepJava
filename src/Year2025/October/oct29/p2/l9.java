package Year2025.October.oct29.p2;

import java.util.HashMap;

public class l9 {
    public static void main(String[] args) {
        String[] s1={"ger","vsda","hytr","poi","fwe"};
        String [] s2={"rtewr","jtr","bdf","hertre","poi"};

        HashMap<String, Boolean> hashMap= new HashMap<>();
        for(String ele: s1){
            hashMap.put(ele,true);
        }

        for(String el: s2){
            hashMap.put(el,true);
        }

        for(String str: hashMap.keySet()){
            System.out.println(str);
        }
    }
}

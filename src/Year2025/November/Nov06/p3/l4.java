package Year2025.November.Nov06.p3;

import java.util.HashMap;

public class l4 {
    public static void main(String[] args) {
        String[] s1={"terw","uty","bad","poij","cdas"};
        String[] s2={"d23","T342t","Grte","vreg","poij"};

        HashMap<String, Boolean> hashMap = new HashMap<>();
        for(String common: s1){
            hashMap.put(common,true);
        }
        for(String common:s2){
            hashMap.put(common,true);
        }

        for(String str:hashMap.keySet()){
            System.out.println(str);
        }
    }
}

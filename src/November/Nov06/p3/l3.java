package November.Nov06.p3;

import java.util.HashMap;

public class l3 {
    public static void main(String[] args) {
        String[] s1={"terw","uty","bad","poij","cdas"};
        String[] s2={"d23","T342t","Grte","vreg","poij"};

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

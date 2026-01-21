package Year2025.October.oct24.p2;

import java.util.HashMap;

public class l3 {
    public static void main(String[] args) {
        String[] s1={"rwe","ytr","kng","pof"};
        String[] s2={"Fsdf","ewqe","kng","ferw"};

        HashMap<String,Boolean> hashMap = new HashMap<>();
        for(String add: s1){
            hashMap.put(add,true);
        }

        for(String add:s2){
            hashMap.put(add,true);
        }

        for(String str: hashMap.keySet()){
            System.out.print(str+" ");
        }

    }
}

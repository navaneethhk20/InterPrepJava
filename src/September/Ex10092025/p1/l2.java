package September.Ex10092025.p1;

import java.util.HashMap;

public class l2 {
    public static void main(String[] args) {
        String[] s1={"fgd","Hfd","gtre","terw"};
        String[] s2={"fsd","fds","fgd","gds","terw"};

        HashMap<String, Integer> hashamp= new HashMap<>();
        for(String common: s1){
            hashamp.put(common, hashamp.getOrDefault(common,0)+1);
        }

        for (String common:s2){
            if(hashamp.containsKey(common)){
                System.out.println(common);
            }
        }
    }
}

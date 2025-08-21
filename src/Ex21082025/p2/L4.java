package Ex21082025.p2;

import java.util.HashMap;

public class L4 {
    public static void main(String[] args) {
        String[] s1={"dfs","Gfds","yte","gfd"};
        String []s2={"gfd","Fsd","Fsdaf"};

        HashMap<String , Integer>hashMap = new HashMap<>();
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

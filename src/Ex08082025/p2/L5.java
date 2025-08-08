package Ex08082025.p2;

import java.util.ArrayList;
import java.util.HashMap;

public class L5 {
    public static void main(String[] args) {
        //find common
        String[] s1={"mango", "banana","milky","orange"};
        String[] s2={"guava", "orange", "beach","milky"};

        ArrayList<String> list = new ArrayList<>();
        for(String common:s1){
            list.add(common);
        }
        for(String common:s2){
            if(list.contains(common)){
                System.out.println(common);
            }
        }
    }
}

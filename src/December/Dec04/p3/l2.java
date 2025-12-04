package December.Dec04.p3;

import java.util.HashMap;
import java.util.HashSet;

public class l2 {
    public static void main(String[] args) {
        String[] arr1={"one","two","three","four","oloy","reww"};
        String[] arr2={"tertr", "uty","three","rwr","qwe"};

        HashSet<String> set= new HashSet<>();
        for(String common:arr1){
            set.add(common);
        }

        for(String common: arr2){
            set.add(common);
        }
        System.out.println(set);
    }
}

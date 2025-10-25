package October.oct25.p3;

import java.util.HashMap;
public class l7 {
    public static void main(String[] args) {
        String[] arr={"gfgdf","Ter","Gerg","GErg","Ger"};
        String[] arr2={"gdfsg","Ger","ge","Grt","Gerg"};

        HashMap<String, Boolean> hashmap = new HashMap<>();
        for(String add: arr){
            hashmap.put(add,true);
        }
        for(String add2: arr2){
            hashmap.put(add2,true);
        }

        for(String str: hashmap.keySet()){
            System.out.print(str+" ");
        }
    }
}

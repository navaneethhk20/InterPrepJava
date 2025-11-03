package November.Nov03.p3;

import java.util.HashMap;

public class l1 {
    public static void main(String[] args) {
       String[] arr1={"fsd","htr","ter","tergfd","morgf"};
       String[] arr2={"eter","plkm","bfdd","ter","grew"};

       HashMap<String,Integer> hashMap = new HashMap<>();
       for(String common: arr1){
           hashMap.put(common,1);
       }

       for(String common: arr2){
           if(hashMap.containsKey(common)){
               System.out.println(common);
           }
       }

    }
}

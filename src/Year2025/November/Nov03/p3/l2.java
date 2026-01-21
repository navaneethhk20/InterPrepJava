package Year2025.November.Nov03.p3;

import java.util.HashMap;

public class l2 {
    public static void main(String[] args) {
        String[] arr1={"fsd","htr","ter","tergfd","morgf"};
        String[] arr2={"eter","plkm","bfdd","ter","grew"};

        HashMap<String,Boolean> hashMap = new HashMap<>();
        for(String add: arr1){
            hashMap.put(add,true);
        }

        for(String add: arr2){
            hashMap.put(add,true);
        }

        for(String str: hashMap.keySet()){
            System.out.println(str);
        }


    }
}

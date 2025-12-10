package December.Dec10.p3;

import java.util.HashMap;

public class l7 {
    public static void main(String[] args) {
        String[] arr1={"rew","vs","uy","sAads"};
        String[] arr2={"fwe","hy6t","uy","aww"};

        HashMap<String,Integer> hashMap= new HashMap<>();
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

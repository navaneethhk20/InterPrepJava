package Year2026.Jan.Day22;

import java.util.HashMap;

public class l23 {
    public static void main(String[] args) {
        String[] ar1={"fsd","hty","sdqw","mhj"};
        String[] ar2={"fsf","hty","hty","htryhe"};

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String common:ar1){
            hashMap.put(common,1);
        }

        for(String common:ar2){
            if(hashMap.containsKey(common)){
                System.out.println(common);
                break;
            }
        }


    }
}

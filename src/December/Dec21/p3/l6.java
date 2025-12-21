package December.Dec21.p3;

import java.util.HashMap;

public class l6 {
    public static void main(String[] args) {
        String []arr={"fsda","erw","eqwe","bfb","eqwq"};
        String[] arr2={"fsdf","bcvbcv","fsda","fwe","wer"};

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String common: arr){
            hashMap.put(common,1);
        }

        for(String common: arr2){
            if(hashMap.containsKey(common)){
                System.out.println(common);
            }
        }
    }
}

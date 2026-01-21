package Year2025.December.Dec21.p3;

import java.util.HashSet;

public class l7 {
    public static void main(String[] args) {
        String []arr={"fsda","erw","eqwe","bfb","eqwq"};
        String[] arr2={"fsdf","bcvbcv","fsda","fwe","wer"};

        HashSet<String> set =new HashSet<>();
        for(String common:arr){
            set.add(common);
        }

        for(String common: arr2){
            set.add(common);
        }
        System.out.println(set);
    }
}

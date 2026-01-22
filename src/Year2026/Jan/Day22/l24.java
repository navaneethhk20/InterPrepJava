package Year2026.Jan.Day22;

import java.util.HashSet;

public class l24 {
    public static void main(String[] args) {
        String[] ar1={"fsd","hty","sdqw","mhj"};
        String[] ar2={"fsf","hty","hty","htryhe"};

        HashSet<String> set= new HashSet<>();
        for(String cm: ar1){
            set.add(cm);
        }

        for(String cs1:ar2){
            set.add(cs1);
        }
        System.out.println(set);
    }
}

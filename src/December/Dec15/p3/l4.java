package December.Dec15.p3;

import java.util.HashSet;

public class l4 {
    public static void main(String[] args) {
        String[] arr1 = {"fsda", "gret", "sxqw", "oui"};
        String[] arr2 = {"fsd", "hu", "nty", "oui"};

        HashSet<String> set= new HashSet<>();
        for(String cm: arr1){
            set.add(cm);
        }

        for(String cm:arr2){
            set.add(cm);
        }

        System.out.println(set);
    }
}

package Ex11082025.Part1;

import java.util.HashSet;

public class P16 {
    public static void main(String[] args) {
        String[] arr1={"age","name","village", "state"};
        String[] arr2={"location","state","district","name"};
        HashSet<String>list =new HashSet<>();
        for(String common: arr1){
            list.add(common);
        }

        for (String common: arr2){
            if(list.contains(common)){
                System.out.println(common);
            }
        }
    }
}

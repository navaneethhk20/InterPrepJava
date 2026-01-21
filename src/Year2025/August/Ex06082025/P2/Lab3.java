package Year2025.August.Ex06082025.P2;

import java.util.HashMap;

public class Lab3 {
    public static void main(String[] args) {
        //find common in two elements
        String[] s1={"mango","ornage","banana"};
        String[] s2={"apple","tomato", "mango"};

        HashMap<String,Integer>list= new HashMap<>();
        for(String fruit:s1){
            list.put(fruit,1);
        }

        for(String fruit:s2) {
            if (list.containsKey(fruit)) {
                System.out.println(fruit);
            }
        }

    }
}

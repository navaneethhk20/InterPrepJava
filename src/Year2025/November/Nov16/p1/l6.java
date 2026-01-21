package Year2025.November.Nov16.p1;

import java.util.*;

public class l6 {
    public static void main(String[] args) {
//Given a hashmap, Sort the hashMap by its value.
//                Input = ("2", "B”),("8", "A”),("4", "D”),("7", "F”),("6", "W”),("19", "J”),("1", "Z”)
//        Output = {8=A, 5=B, 3=D, 7=F, 10=J, 2=W, 1=Z}*/

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("2","B");
        hashmap.put("8","A");
        hashmap.put("4","D");
        hashmap.put("7","F");
        hashmap.put("6","W");
        hashmap.put("19","J");
        hashmap.put("1","Z");

        List<Map.Entry<String,String>> list= new ArrayList<>(hashmap.entrySet());

        Collections.sort(list,(a,b)-> a.getValue().compareTo(b.getValue()));

        for (Map.Entry<String, String> e : list) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }
    }
}

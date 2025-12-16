package December.Dec16.p3;

import java.util.*;

public class l6 {
    public static void main(String[] args) {
        //Input=(2,B),(4,A),(6,C),(7,S),(3,U)
//((4,A),(2,B),(6,C),(7,S),(3,U)
        HashMap<Integer, Character> hashMap = new HashMap<>();
        hashMap.put(2, 'B');
        hashMap.put(4, 'A');
        hashMap.put(6, 'C');
        hashMap.put(7, 'S');
        hashMap.put(3, 'U');

        // Convert to list and sort by values (alphabets)
        List<Map.Entry<Integer, Character>> list = new ArrayList<>(hashMap.entrySet());

        Collections.sort(list, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));

        for(Map.Entry<Integer, Character> entry : list) {
            System.out.println("(" + entry.getKey() + "," + entry.getValue() + ")");
        }


    }
}

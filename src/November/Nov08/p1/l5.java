package November.Nov08.p1;
import java.util.HashMap;
public class l5 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 4, 4, 2, 1};
        int[] num2 = {2, 2, 3};

        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int num : num2) {
            hashmap.put(num, 1);
        }

        for (int num : num1) {
            if (hashmap.containsKey(num)) {
                System.out.println(num);
            }
        }
    }
}

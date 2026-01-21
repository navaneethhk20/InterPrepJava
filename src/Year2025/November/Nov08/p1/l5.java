package Year2025.November.Nov08.p1;
import java.util.HashSet;
public class l5 {
    public static void main(String[] args) {
        int[] num1 = {1, 2,4, 4, 2, 1};
        int[] num2 = {2, 2, 3};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : num1) set1.add(num);
        for (int num : num2) set2.add(num);


        for (int num : num1) {
            //not common: if (!set2.contains(num)) {
            if (set2.contains(num)) {
                System.out.println(num);
            }
        }

        for (int num : num2) {
            if (set1.contains(num)) {
                System.out.println(num);
            }
        }
    }
}

